package zoey.demo.springboot.Chapter2.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zoey on 2018/4/4.
 */
@Configuration
public class ProfileConfig {
    //Profile为dev时实例化
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from develpment frofile");
    }
    //Profile为prod时实例化
    @Bean
    @Profile("prop")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
