import frc.team6644.robot.RobotPorts;
public class JoystickDrive extends Command{
	Joystick stick = new Joystick(RobotPorts.JOYSTICK);
	double sensitivity = 1;
	protected void initialize() {
	}
	public double getSensitivity() {
		return -(stick.getRawAxis(3)-1)/2;
	}
	protected void execute() {
	}
	protected void testEncoders() {
	}
	protected void end() {
	}
	@Override
	protected boolean isFinsihed() {
		return false;
	}
}
