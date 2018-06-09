/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public static final double JOY_DEADZONE = 0.05;

	public final Joystick CONTROLLER = new Joystick(RobotMap.MAIN_CONTROLLER.value);

	public double getLeftJoyY() {
		double raw = CONTROLLER.getRawAxis(1);
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}

	public double getRightJoyY() {
		double raw = CONTROLLER.getRawAxis(2);
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}

	public OI() {

	}
}
