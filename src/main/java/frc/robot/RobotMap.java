/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int pdpCAN = 6;
  public static int controllerOnePort = 0;
  public static int controllerTwoPort = 1;

  public static int leftFrontDriveCAN = 15;
  public static int leftCenterDriveCAN = 11;
  public static int leftBackDriveCAN = 12;
  public static int rightFrontDriveCAN = 4;
  public static int rightCenterDriveCAN = 13;
  public static int rightBackDriveCAN = 14;

  public static int shiftSolenoid = 0;
  public static int hatchActuate = 1;
  public static int hatchTilt = 2;

  public static int stiltWheelsRotateLeftCAN = 6; // rotate the wheels
  public static int stiltWheelsRotateRightCAN = 8;
  public static int stiltWheelsActuateLeftCAN = 7; // spin the wheels (drive forward)
  public static int stiltWheelsActuateRightCAN = 9;

  public static int CargoClawLimit = 0;
  public static int cargoArmActuateOnePWM = 9;
  public static int cargoClawLeftRotatePWM = 8;
  public static int cargoClawRightRotatePWM = 0;

  public static int PCMOneCAN = 13;
  public static int PCMTwoCAN = 14;

  public static int backStiltExtendOne = 0;
  public static int backStiltExtendTwo = 1;
  public static int backStiltRetractOne = 4;
  public static int backStiltRetractTwo = 5;
  public static int frontStiltExtendOne = 2;
  public static int frontStiltExtendTwo = 3;
  public static int frontStiltRetractOne = 6;
  public static int frontStiltRetractTwo = 7;
  public static int ballLimitDIO = 0;

  public static int pressureSwitch = 0;
  public static int Pressure_read = 0;

  public static int leftRampOne = 0;
  public static int leftRampTwo = 1;
  public static int rightRampOne = 2;
  public static int rightRampTwo = 3;

  public static int xButton = 3;
  public static int yButton = 4;

  public static int rightStickX = 4;
  public static int aButton = 1;
  public static int bButton = 2;
  public static int leftTrigger = 2;
  public static int leftStickY = 1;
  public static int rightTrigger = 3;
  public static int leftBumper = 5;
  public static int rightBumper = 6;
  public static int selectButton = 7;
  public static int startButton = 8;
}
