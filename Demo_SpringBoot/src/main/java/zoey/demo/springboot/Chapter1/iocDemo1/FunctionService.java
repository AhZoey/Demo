package zoey.demo.springboot.Chapter1.iocDemo1;

import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/3.
 * 功能类
 */
 @Service //使用@Service注解当前声明的FunctionService类是Spring管理的一个Bean，和使用@Component\@Service\@repository\@Controller是等效的
public class FunctionService {
    public String sayHello(String word){
        return "Hello,"+word+"!";
    }
}
