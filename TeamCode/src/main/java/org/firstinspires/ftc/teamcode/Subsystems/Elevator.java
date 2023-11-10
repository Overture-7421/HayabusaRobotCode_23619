package org.firstinspires.ftc.teamcode.Subsystems;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;


public class Elevator {

    private DcMotorEx left_Elevator;
    private DcMotorEx right_Elevator;

    private Gamepad operatorGamepad;


    public  Elevator (HardwareMap hardwareMap, Gamepad operatorGamepad) {
        this.operatorGamepad = operatorGamepad;

        left_Elevator = hardwareMap.get(DcMotorEx.class, "left_Elevator");
        right_Elevator = hardwareMap.get(DcMotorEx.class, "right_Elevator");
    }

    public void elevatorLoop() {
       if (operatorGamepad.a) {
                left_Elevator.setPower(0.5);
                right_Elevator.setPower(-0.5);
            } else if (operatorGamepad.b) {
                left_Elevator.setPower(-0.5);
                right_Elevator.setPower((0.5));
            } else {
                left_Elevator.setPower(0);
                right_Elevator.setPower(0);
            }
    }
}
