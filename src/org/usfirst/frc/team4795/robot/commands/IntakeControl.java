package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;
import org.usfirst.frc.team4795.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeControl extends Command {

	public IntakeControl() {
		requires(Robot.intake);
	}

	protected void intialize() {

	}

	protected void execute() {
		boolean isIntaking = Robot.oi.CONTROLLER.getRawButton(RobotMap.INTAKE_BUTTON.value);
		Robot.intake.setMotor(isIntaking ? 1.0 : -1.0);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void interrupted() {
		// default behavior
		end();
	}

}
