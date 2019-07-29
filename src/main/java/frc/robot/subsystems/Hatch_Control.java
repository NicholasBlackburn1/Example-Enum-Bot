package frc.robot.subsystems;

/**
 * @author Nichoalas Blackburn 
 * @see Hatch control uses enums to set the Hatch to tilt 
 *
 */
import frc.robot.OI;
import frc.robot.Enums.Hatch;

public class Hatch_Control {
    public static void Tilt(Hatch hatch) {
        switch (hatch) {
        case Extend:
            //pushes hatch out 
            OI.hatchTiltSolenoid.set(true);
            break;

        case Retract:
        // pull hatch in 
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
                // opens manipulator 
                OI.hatchActuateSolenoid.set(true);
            break;
            
        case Close:
               // closes manipulator
                OI.hatchActuateSolenoid.set(false);
            break;

                default:
                OI.hatchActuateSolenoid.set(false);
            break;
        }
        
    }
}