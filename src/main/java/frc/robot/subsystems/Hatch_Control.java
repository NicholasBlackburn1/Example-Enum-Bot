package frc.robot.subsystems;

/**
 * @author 
 * @date
 */
import frc.robot.OI;
import frc.robot.Enums.Hatch;

public class Hatch_Control {
    public static void Tilt(Hatch hatch) {
        switch (hatch) {
        case Extend:
            OI.hatchTiltSolenoid.set(true);
            break;

        case Retract:
            OI.hatchTiltSolenoid.set(false);
            break;

        default:
            OI.hatchTiltSolenoid.set(false);
            break;
        }
    }

    public static void mainip(Hatch Manip) {
        switch (Manip) {
                
                case Open:
                OI.hatchActuateSolenoid.set(true);
            break;
            
                case Close:
                OI.hatchActuateSolenoid.set(false);
            break;

                default:
                OI.hatchActuateSolenoid.set(false);
            break;
        }
        
    }
}