// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  CommandXboxController m_driverController = new CommandXboxController(0); 
  Joystick m_Testjoystick = new Joystick(2);
  public RobotContainer() {
    configureBindings();
  }


  private void configureBindings() {
  m_driverController.a().and(m_driverController.leftBumper().negate()).onTrue(new InstantCommand(() -> System.out.println("its luis mm")));
  m_driverController.b().and(m_driverController.leftBumper().negate()).onTrue(new InstantCommand(() -> System.out.println("its chichi!")));
  m_driverController.y().and(m_driverController.leftBumper().negate()).onTrue(new InstantCommand(() -> System.out.println("its yacine")));
  m_driverController.x().and(m_driverController.leftBumper().negate()).onTrue(new InstantCommand(() -> System.out.println("its austin!!")));
  m_driverController.leftBumper().and(m_driverController.a()).onTrue(new InstantCommand(() -> System.out.println("its not luis")));
  
  // if right trigger AND a held say its not luis!!!!    
  

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
