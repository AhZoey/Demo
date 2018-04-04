package zoey.demo.springboot.Chapter1.iocDemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zoey on 2018/4/3.
 * 配置类
 */
@Configuration//@Configuration声明当前类是一个配置类
public class JavaDiConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService=new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
    //和上一个方法的目的一样，实现方式略有区别
//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){
//        UseFunctionService useFunctionService=new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
