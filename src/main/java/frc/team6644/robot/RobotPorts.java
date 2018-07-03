package frc.team6644.robot;
public enum RobotPorts {
	//Laptop USB Ports
	JOYSTICK(0),
	//Sensors on Robot
	
	//PWM Ports
	RIGHT_DRIVE_PWM_SPLIT(0), LEFT_DRIVE_PWM_SPLIT(1);
	//Digital Ports
	
	private final int portnumber;
	private RobotPorts(int portnumber) {
	this.portnumber=portnumber;
	}
	public int get() {
		return this.portnumber;
	}
}
