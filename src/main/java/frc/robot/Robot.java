/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.Teleop;
import frc.robot.subsystems.Teleop_Controller2;


public class Robot extends TimedRobot {
  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() { /** runs init code on startup */
   
  }

  @Override
  public void robotPeriodic() {/** updates every 30ms  */
  }

 
  @Override
  public void disabledInit() { /**  inits when disabled  */
  }

  @Override
  public void disabledPeriodic() {/** runs when disabled */
    Scheduler.getInstance().run();
  }

 
  @Override
  public void autonomousInit() {
   
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {
  ;
  }

  /**
   * This function is called periodically during Teleop
   */
  @Override
  public void teleopPeriodic() {
    Teleop.Periodic(); /** Driver Teleop control class */
    Teleop_Controller2.Teleop2(); /** Operators Teleop control class */
    Scheduler.getInstance().run(); /** Scheduler statrs  */
  }

  
  @Override
  public void testPeriodic() {
  }
}
