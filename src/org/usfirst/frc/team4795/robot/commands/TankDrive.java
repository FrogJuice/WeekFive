package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.drivebase);
	}

	protected void intialize() {

	}

	protected void execute() {
		Robot.drivebase.setMotors(Robot.oi.getLeftJoyY(), Robot.oi.getRightJoyY());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void interrupted() {
		// default behavior
		end();
	}

}
