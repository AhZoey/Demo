package zoey.demo.springboot.Chapter1.iocDemo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zoey on 2018/4/3.
 * 配置类
 */
@Configuration//@Configuration声明当前类是一个配置类
//@ComponentScan 自动扫描包下面所有使用@Service、@Component、@Repository和@Controller的类并注册Bean
@ComponentScan("zoey.demo.springboot.iocDemo1")
public class DiConfig {
}
