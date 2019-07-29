package frc.robot.subsystems;

import frc.robot.OI;
import frc.robot.RobotMap;

public class Teleop_Controller2 {
    
    public static void Teleop2() {

        if (OI.controller2.getRawButton(RobotMap.leftBumper) == true) { // shoot ball
            Cargo.actuateClaw(-.35);
        } else if (OI.controller2.getRawButton(RobotMap.rightBumper) && !OI.ballLimit.get()) {
            Cargo.actuateClaw(.5);
        } else {
            Cargo.stopClaw();
        }

        if (OI.controller2.getRawAxis(RobotMap.rightTrigger) != 0) { // toggle hatch manipulator
            Hatch.actuate("open");
        }

        if (OI.controller2.getRawAxis(RobotMap.leftStickY) != 0) { // move cargo arm up and down
            Cargo.actuateArm(-OI.controller2.getRawAxis(RobotMap.leftStickY) * .5);

        } else if (OI.controller2.getRawAxis(RobotMap.leftStickY) == 0
                && OI.controller2.getRawButton(RobotMap.xButton) == false) {
            Cargo.stopArm();
        }
        if (OI.controller2.getRawAxis(RobotMap.leftTrigger) != 0) { // tilt hatch manipulator out
            Hatch.actuate("close");
        }
    }
}