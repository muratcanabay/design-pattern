package mabay.designpatterns.creationalpatterns.builder;

import com.mabay.designpatterns.creationalpatterns.builder.RobotFactory;
import org.junit.Test;

/**
 * RobotTest
 *
 * @author Murat Can Abay
 * @since 17/07/2020
 */
public class RobotTest {

    @Test
    public void robotUretTest() {

        RobotFactory robotFactory = new RobotFactory(200L, 400L, 300L);
        robotFactory.robotUret(150L, 30L, 40L).setIsim(10).setAgirlik(60L).greet().setAgirlik(20L).setIsim(5).greet();
        robotFactory.robotUret(120L, 60L, 70L).setIsim(5).setAgirlik(90L).greet();

        robotFactory.robotUretimiBasariliMi(true);
        robotFactory.robotUretimiBasariliMi(false);

        Long toplamRobotSayisi = robotFactory.uretilenToplamRobotSayisi();
        System.out.println(toplamRobotSayisi);
    }
}
