package frc.robot.subsystems;
/**
 * @author Nicholas Blackburn 
 * @see Controller 1 (Driver controller)
 * Button A - extends Front Pistons 
 * Button B - Retracts Front Pistons
 * Button x - Extends Back Pistons 
 * Button y - Retracts Back Pistons 
 * RightTrigger - Toggles shifting  
 *  
 */


import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.Enums.Lift_Pistons;
import frc.robot.Enums.Shift;

public class Teleop {

    public static void Periodic() {
        DriveTrain.periodic();
        
        if (OI.controller1.getRawAxis(RobotMap.rightTrigger) == 1) { /* !< Funtion Shifts into High Gear */
            DriveTrain.shift(Shift.High_Gear);
        }
        else {
            DriveTrain.shift(Shift.Low_Gear); 
        }
        // Clime control
        if (OI.controller1.getRawButton(RobotMap.aButton)) { /* !< Button A is Presses Front side of Robot Extends */
            Stilts.actuateFront(Lift_Pistons.Extend);
        }
        if (OI.controller1.getRawButton(RobotMap.bButton)) {/* !< Button B is Presses Front side of Robot Retracted  */
            Stilts.actuateFront(Lift_Pistons.Retract);
        }
        if (OI.controller1.getRawButton(RobotMap.xButton)) {/* !< Button X is Presses Backend of Robot Extends  */
            Stilts.actuateBack(Lift_Pistons.Extend);
        }
        if (OI.controller1.getRawButton(RobotMap.yButton)) { /* !< Button Y is Presses Backend of Robot Retracted */
            Stilts.actuateBack(Lift_Pistons.Retract);
        }

    }
}
