package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    private Servo claw;

    private Gamepad operatorGamepad;

    public Claw (HardwareMap hardwareMap, Gamepad operatorGamepad) {
        this.operatorGamepad = operatorGamepad;

        claw = hardwareMap.get(Servo.class, "claw");

    }
    public void clawLoop() {

        if (operatorGamepad.x) {
            claw.setPosition(1);
        }   else if(operatorGamepad.y) {
            claw.setPosition(0);
        }
    }

}
