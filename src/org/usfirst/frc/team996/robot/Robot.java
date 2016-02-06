
package org.usfirst.frc.team996.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public static Subsystem turret;
	Joystick driveStick   ;    //Intialize  Joy stick
	Joystick driveStick1  ;	//intialize Joy stick
	
	RobotDrive chassis;
	
	
	
	double driver1X;         //setting direction control for joy stick
    double driver1Y;			 //setting direction control for joy stick
    
    double driverX;		//setting direction control for joy stick	
    double driverY;		//setting direction control for joy stick
	
	final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    SendableChooser chooser;
   
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	 chassis = new RobotDrive(0, 1);
         chassis.setExpiration(0.1);
         driveStick = new Joystick(0);
         driveStick1 = new Joystick(1);
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", defaultAuto);
        chooser.addObject("My Auto", customAuto);
        SmartDashboard.putData("Auto choices", chooser);
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void SetTargetAngle() {
		// TODO Auto-generated method stub
			
	}
    
    private void delay() {
		// TODO Auto-generated method stub
		
	}

	private boolean AtRightAngle() {
		// TODO Auto-generated method stub
		return false;
	}

	private void CorectAngle() {
		// TODO Auto-generated method stub
		
	}

    private void HoldAngle() {
		// TODO Auto-generated method stub
		
	}
    

	public void autonomousInit() {
    	autoSelected = (String) chooser.getSelected();
//		autoSelected = SmartDashboard.getString("Auto Selector", defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
		Object autonomousCommand = null;
		
	/**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	Scheduler.getInstance().run();
    	
    	
    	switch(autoSelected) {
    	case customAuto:
        //Put custom auto code here   
            break;
    	case defaultAuto:
    	default:
    	//Put default auto code here
            break;
    	}
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    
   	 driver1X=  driveStick.getX();         //setting direction control for joy stick
     driver1Y= driveStick.getY();			 //setting direction control for joy stick
    
     driverX= driveStick1.getX();		//setting direction control for joy stick	
     driverY= driveStick1.getY();	
     
     
     
    System.out.println();
      
     chassis.arcadeDrive(driveStick);
 	
      
      
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
