package frc.robot.subsystems;



import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.OI;
import frc.robot.Enums.Shift;


public class DriveTrain {
 
        public DriveTrain() {
        }
       
        public static void shift(Shift direction) {
            switch (direction) {
            case High_Gear:
               
            OI.shiftSolenoid.set(true);
                break;
            case Low_Gear:
               
                OI.shiftSolenoid.set(false);
                break;
            }
        }

        public static void periodic() {
            OI.drive.arcadeDrive(-OI.controller1.getRawAxis(1), OI.controller1.getRawAxis(4));
        }
    }
