package zoey.demo.springboot.Chapter1.iocDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/3.
 * 功能类
 */
@Service //1
public class UseFunctionService {
    @Autowired //使用@Autowired将FunctionService的实体Bean注入当UseFunctionService中，和JSR-330的@Inject注解或者JSR-350的@Resurce注解是一样的
            FunctionService functionService;
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
