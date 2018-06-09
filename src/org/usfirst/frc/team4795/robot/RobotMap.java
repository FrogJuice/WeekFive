/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

public enum RobotMap {
	//PWM Motor Mappings
	LEFT_MOTOR(0),
	RIGHT_MOTOR(1),
	INTAKE_MOTOR(2),
	//Control Mappings
	MAIN_CONTROLLER(0),
	LEFT_JOYSTICK(1),
	RIGHT_JOYSTICK(2),
	INTAKE_BUTTON(5),
	OUTTAKE_BUTTON(6);
	public final int value;
	
	RobotMap(int value){
	this.value = value;
			}
}