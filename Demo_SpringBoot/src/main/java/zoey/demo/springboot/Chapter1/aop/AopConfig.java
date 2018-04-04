package zoey.demo.springboot.Chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zoey on 2018/4/3.
 */
@Configuration
@ComponentScan("zoey.demo.springboot.aop")
//开启Spring对Aspect代理的支持
@EnableAspectJAutoProxy
public class AopConfig {
}
