package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Chassis;
import org.firstinspires.ftc.teamcode.Subsystems.Elevator;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;
import org.firstinspires.ftc.teamcode.Subsystems.Shooter;

@TeleOp
public class MainSystem extends LinearOpMode {

    Chassis chassis;
    Elevator elevator;
    Claw claw;
    Arm arm;
    Shooter shooter;

    private Gamepad driverGamepad;
    private Gamepad operatorGamepad;

    @Override
    public void runOpMode() {
        driverGamepad = gamepad1;
        operatorGamepad = gamepad2;

        chassis = new Chassis(hardwareMap, driverGamepad); // Create an instance of Chassis
        elevator = new Elevator(hardwareMap, operatorGamepad);  // Create an instance of Elevator
        claw = new Claw(hardwareMap, operatorGamepad);          //Create an instance of Claw
        arm = new Arm(hardwareMap, operatorGamepad); //Create an instance of Arm
        shooter = new Shooter(hardwareMap, operatorGamepad); //Create an instance of Shooter

        waitForStart();

        while (opModeIsActive()) {
            chassis.chassisLoop();
            elevator.elevatorLoop();
            claw.clawLoop();
            arm.armLoop();
            shooter.shooterLoop();

            telemetry.addData("Status", "Go");
            telemetry.update();
        }
    }
}


