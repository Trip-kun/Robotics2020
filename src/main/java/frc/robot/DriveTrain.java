package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain {
    private DifferentialDrive driveFront;
    private DifferentialDrive driveRear;
    private Motor leftMotor;
    private Motor rightMotor;
    private Motor rightRearMotor;
    private Motor leftRearMotor;
    private XboxController xbox;
    public DriveTrain(Motor lm, Motor rm, Motor lrm, Motor rrm, XboxController xbx) {
        leftMotor=lm; rightMotor=rm; leftRearMotor =lrm; rightRearMotor=rrm; xbox=xbx;
        driveFront=new DifferentialDrive(leftMotor.getRawMotor(), rightMotor.getRawMotor());
        driveRear=new DifferentialDrive(leftRearMotor.getRawMotor(), rightRearMotor.getRawMotor());
    }
    public void ArcadeDrive(boolean squared) {
        driveFront.arcadeDrive(xbox.getX(), xbox.getY(), squared);
    }
    public void periodic() {
        leftMotor.periodic();
        rightMotor.periodic();
        leftRearMotor.periodic();
        rightRearMotor.periodic();
    }
}
