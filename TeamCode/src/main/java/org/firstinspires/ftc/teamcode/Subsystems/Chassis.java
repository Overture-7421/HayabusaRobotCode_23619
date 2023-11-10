package org.firstinspires.ftc.teamcode.Subsystems;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Chassis {

    private DcMotor left_Drive;
    private DcMotor right_Drive;

    private Gamepad driverGamepad;

    public Chassis(HardwareMap hardwareMap, Gamepad driverGamepad) {
        this.driverGamepad = driverGamepad;

        left_Drive = hardwareMap.get(DcMotor.class, "left_Drive");
        right_Drive = hardwareMap.get(DcMotor.class, "right_Drive");
    }

    public void chassisLoop() {
        float y = - driverGamepad.left_stick_y;
        float x = driverGamepad.right_stick_x;
        right_Drive.setPower(y + x);
        left_Drive.setPower(x - y);
    }
}



