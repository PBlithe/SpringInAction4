package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.SgtPepper;

@Configuration//表明这是一个配置类
public class CDPlayerConfig {
    //beanID通常为方法名可以通过name属性更改ID
    /*@Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPepper();
    }
     */
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPepper();
    }
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
