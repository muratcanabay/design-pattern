package mabay.designpatterns.creationalpatterns.prototype;

import com.mabay.designpatterns.creationalpatterns.prototype.Robot;
import com.mabay.designpatterns.creationalpatterns.prototype.RobotFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * PrototypeTest
 *
 * @author Murat Can Abay
 * @since 10/08/2020
 */
public class PrototypeTest {

    @Test
    public void robotFactoryTest() {

        RobotFactory robotFactory = RobotFactory.getInstance();

        Robot robot1 = robotFactory.produceRobot();
        robot1.setId(1L);
        robot1.setName("Robot1");

        Robot robot2 = robot1.clone();
        robot2.setId(2L);
        robot2.setName("Robot2");

        Robot robot3 = robot1.clone();
        robot3.setId(3L);
        robot3.setName("Robot3");

        Robot robot4 = robot1.clone();
        robot4.setId(4L);
        robot4.setName("Robot4");

    }

    @Test
    public void robotFactoryUniquelessTest() {

        RobotFactory robotFactory = RobotFactory.getInstance();
        RobotFactory robotFactory1 = RobotFactory.getInstance();

        System.out.println("" + robotFactory + "\n" + robotFactory1 + "");
        Assert.assertEquals(robotFactory, robotFactory1);
    }
}
