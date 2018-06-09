package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.RobotMap;
import org.usfirst.frc.team4795.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {

	private Spark leftMotor;
	private Spark rightMotor;

	public Drivebase() {
		leftMotor = new Spark(RobotMap.LEFT_MOTOR.value);
		rightMotor = new Spark(RobotMap.RIGHT_MOTOR.value);
	}

	public void setMotors(double leftvalue, double rightvalue) {
		leftMotor.set(leftvalue);
		rightMotor.set(rightvalue);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

}
