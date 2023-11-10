package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Shooter {

    private Servo Shooter;

    private Gamepad operatorGamepad;

    public Shooter (HardwareMap hardwareMap, Gamepad operatorGamepad) {
        this.operatorGamepad = operatorGamepad;

        Shooter = hardwareMap.get(Servo.class, "shooter");

    }
    public void shooterLoop(){
        if (operatorGamepad.left_stick_button) {
            Shooter.setPosition(1);
        }   else if(operatorGamepad.right_stick_button) {
            Shooter.setPosition(0);
        }

    }
}
