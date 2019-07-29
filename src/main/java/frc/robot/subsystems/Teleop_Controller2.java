package frc.robot.subsystems;

import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.Enums.Hatch;

/** 
 * @author
 * @see
 * @apiNote
 * @version 
 * Button Maps 
 * Controller 2 (Operator controller)
 * LeftBumper - Sucks in ball 
 * RightBumper - Throws ball
 * LeftTrigger - closes hatch
 * RightTrigger - opens hatch
 * LeftStick - moves Cargo arm 
 * Button X - Stop Cargo arm
 * 
 */

public class Teleop_Controller2 {

    public static void Teleop2() {

        if (OI.controller2.getRawButton(RobotMap.leftBumper) == true) {
            Cargo.actuateClaw(-.35);
        } else if (OI.controller2.getRawButton(RobotMap.rightBumper) && !OI.ballLimit.get()) {
            Cargo.actuateClaw(.5);
        } else {
            Cargo.stopClaw();
        }

        if (OI.controller2.getRawAxis(RobotMap.rightTrigger) != 0) {
            Hatch_Control.mainip(Hatch.Open);
        }
        if (OI.controller2.getRawAxis(RobotMap.leftTrigger) != 0) {
            Hatch_Control.mainip(Hatch.Close);
        }
        if (OI.controller2.getRawAxis(RobotMap.leftStickY) != 0) {
            Cargo.actuateArm(-OI.controller2.getRawAxis(RobotMap.leftStickY) * .5);

        } else if (OI.controller2.getRawAxis(RobotMap.leftStickY) == 0
                && OI.controller2.getRawButton(RobotMap.xButton) == false) {
            Cargo.stopArm();
        }
    }
}