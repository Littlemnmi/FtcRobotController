package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {
    private DcMotor testMotor;
    private double ticksPerRevTestMotor;

    void init(HardwareMap hwMap) {
        testMotor = hwMap.get(DcMotor.class, "Emma");
        testMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRevTestMotor = testMotor.getMotorType().getTicksPerRev();
    }

    void setSpeed(double speed) {
        testMotor.setPower(speed);
    }

    double getRotations() {
        return ((double) testMotor.getCurrentPosition()) / ticksPerRevTestMotor;
    }
}
