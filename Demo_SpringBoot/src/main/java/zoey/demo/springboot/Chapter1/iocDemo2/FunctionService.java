package zoey.demo.springboot.Chapter1.iocDemo2;

import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/3.
 * 功能类
 */
//没有@Service注解
public class FunctionService {
    public String sayHello(String word){
        return "Hello,"+word+"!";
    }
}
