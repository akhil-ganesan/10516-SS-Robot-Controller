package org.firstinspires.ftc.teamCode_10516.Autonomous.Navigation;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamCode_10516.Robot;

@Autonomous(name = "Bridge Navigation", group = "Navigation" )
public class Bridge extends LinearOpMode {
    // Creating the Robot Object
    private Robot robot = new Robot();

    @Override
    public void runOpMode() {
        // Setting Up Robot Hardware
        robot.init(hardwareMap);
        // Waiting for Start Button
        waitForStart();
        // Strafe Left Under SkyBridge
        robot.driveMotors = new DcMotor[]{robot.frontLeft, robot.frontRight, robot.backLeft, robot.backRight};
        robot.encoderStrafe(0.5, 1200);
        robot.encoderDrive(0.5,1000);
    }
}
