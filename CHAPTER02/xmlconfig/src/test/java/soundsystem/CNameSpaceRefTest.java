package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "CNameSpaceRefTest.xml")
public class CNameSpaceRefTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        player.play();
    }
}
