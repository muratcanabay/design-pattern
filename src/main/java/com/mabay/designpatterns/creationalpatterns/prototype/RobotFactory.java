package com.mabay.designpatterns.creationalpatterns.prototype;

/**
 * RobotFactory
 *
 * @author Murat Can Abay
 * @since 10/08/2020
 */
public class RobotFactory {

    private static RobotFactory robotFactory;

    private RobotFactory() {
    }

    public static RobotFactory getInstance() {

        if (robotFactory == null) {
            robotFactory = new RobotFactory();
        }

        return robotFactory;
    }

    public Robot produceRobot() {
        Robot robot = new Robot();
        return robot;
    }

    @Override
    public String toString() {
        return String.valueOf(robotFactory.getClass().hashCode());
    }
}
