package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.OI;
import frc.robot.Enums.Lift_Pistons;

/**
 * @author
 * Switch statemints for both Sets of Stilts 
 * Lift_Pistons is an Enum set is a list for case statements 
 */
public class Stilts {
    // Function for controlling lifing robot up
    public static void actuateFront(Lift_Pistons Stilts) {
        switch (Stilts) {
        case Extend:
            OI.frontStilt.set(Value.kForward);
            break;
        case Retract:
            OI.frontStilt.set(Value.kReverse);
            break;
        default:
            OI.frontStilt.set(Value.kOff);
            break;
        }
        }

        public static void actuateBack(Lift_Pistons Stilts) {
        switch (Stilts) {
        case Extend:
            OI.backStilt.set(Value.kForward);
            break;
        case Retract:
            OI.backStilt.set(Value.kReverse);
            break;
        default:
            OI.backStilt.set(Value.kOff);
            break;
        }
    }
}