package frc.robot.subsystems;
/*
 Button Maps 
 Controller 1 (Driver controller)
 Button A - extends Front Pistons 
 Button B - Retracts Front Pistons
 Button x - Extends Back Pistons 
 Button y - Retracts Back Pistons 
 Trigger 
 
*/

import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.Enums.Lift_Pistons;
import frc.robot.Enums.Shift;

public class Teleop {

    public static void Periodic() {
        DriveTrain.periodic();
        // shifting control
        if (OI.controller1.getRawAxis(RobotMap.rightTrigger) == 1) { // shift up and down
            DriveTrain.shift(Shift.High_Gear);
        }
        else {
            DriveTrain.shift(Shift.Low_Gear);
        }
        // Clime control
        if (OI.controller1.getRawButton(RobotMap.aButton)) {
            Stilts.actuateFront(Lift_Pistons.Extend);
        }
        if (OI.controller1.getRawButton(RobotMap.bButton)) {
            Stilts.actuateFront(Lift_Pistons.Retract);
        }
        if (OI.controller1.getRawButton(RobotMap.xButton)) {
            Stilts.actuateBack(Lift_Pistons.Extend);
        }
        if (OI.controller1.getRawButton(RobotMap.yButton)) {
            Stilts.actuateBack(Lift_Pistons.Retract);
        }

    }
}
