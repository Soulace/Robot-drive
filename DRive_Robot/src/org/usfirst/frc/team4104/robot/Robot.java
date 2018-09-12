/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4104.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends IterativeRobot {

	public static WPI_TalonSRX LeftMotor1=new WPI_TalonSRX(1);
	public static WPI_TalonSRX LeftMotor2=new WPI_TalonSRX(2);
	public static WPI_TalonSRX RightMotor1=new WPI_TalonSRX(3);
	public static WPI_TalonSRX RightMotor2=new WPI_TalonSRX(4);

        SpeedControllerGroup m_left = new SpeedControllerGroup(LeftMotor1, LeftMotor2);
	SpeedControllerGroup m_right = new SpeedControllerGroup(RightMotor1, RightMotor2);

        DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

	
	private Joystick m_leftStick = new Joystick(1);
	private Joystick m_rightStick = new Joystick(2);

	
	@Override
	public void robotInit() {
		
		
		//m_myRobot = new DifferentialDrive(null,null);
		//m_leftStick = new Joystick(1);
		//m_rightStick = new Joystick(2);
		
	
	} 
	
	public void teleopInit() {
		//The teleopInit method is called once each time the robot enters teleop mode
	}
	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
		m_drive.tankDrive(m_leftStick.getRawAxis(0), m_rightStick.getRawAxis(0));
		//double leftSpeed = -m_rightStick.getRawAxis(1);
		//double rightSpeed = -m_leftStick.getRawAxis(1);
	
		//LeftMotor1.set(leftSpeed);
		//LeftMotor2.set(leftSpeed);
		//RightMotor1.set(rightSpeed);
		//RightMotor2.set(rightSpeed);
	
		
	}
}
