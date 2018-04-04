package zoey.demo.springboot.Chapter2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zoey on 2018/4/4.
 */
@Configuration
@ComponentScan("zoey.demo.springboot.Chapter2.prepost")
public class PrepostConfig {
    //initMethod和destroyMethod指定BeanWayService类的init()和destroy()方法在构造方法之后，Bean销毁之前执行
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
