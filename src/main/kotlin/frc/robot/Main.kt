package frc.robot

import edu.wpi.first.wpilibj.RobotBase

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        RobotBase.startRobot { Robot() }
    }
}
