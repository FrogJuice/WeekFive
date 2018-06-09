package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.RobotMap;
import org.usfirst.frc.team4795.robot.commands.IntakeControl;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	private Spark intakeMotor;

	public Intake() {
		intakeMotor = new Spark(RobotMap.INTAKE_MOTOR.value);
	}

	public void setMotor(double speed) {
		intakeMotor.set(speed);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new IntakeControl());
	}

}
