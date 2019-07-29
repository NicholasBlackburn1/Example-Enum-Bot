package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.OI;
import frc.robot.RobotMap;

public class Cargo {
  public static Timer cargoTimer = new Timer();
  private static double buffer = 0.5;
  private static boolean hasBall = false;
  private static boolean stowed = false;
  private static boolean intaking = false;
  public Cargo() {}
  public static void actuateArm(double speed) {
    OI.cargoArmActuateOne.set(speed);
  }
  public static void stopArm() {
    OI.cargoArmActuateOne.set(0);
  }
  public static void actuateClaw(double speed) {
    OI.cargoIntake.set(speed);
  }
  public static void stopClaw() {
    OI.cargoIntake.set(0);
  }
  public static void holdBall() {
    OI.cargoIntake.set(0);
  }
  public static void update() {
    if(hasBall && intaking && !stowed) {
      //slowly run intake to secure ball
      if(cargoTimer.get() <= buffer) {
        actuateClaw(0.2);
      } else {
        intaking = false;
        stowed = true;
        cargoTimer.reset();
      }
    } else if(hasBall && !intaking && stowed) {
      //run intake very slowly to keep ball in
     // holdBall();
      hasBall = OI.ballLimit.get();
    } else if(hasBall && !intaking && !stowed) {
      //start the process to secure ball
      intaking = true;
      cargoTimer.reset();
      System.out.println("Cargo Timer: " + cargoTimer.get());
    } else {
      //do nothing
    }
    if(OI.controller2.getRawButton(RobotMap.rightBumper) && !intaking && !hasBall && !stowed) {
      //run intake if button is pressed and intake is in default position
      hasBall = OI.ballLimit.get();
      actuateClaw(0.5);
    }
  }
}