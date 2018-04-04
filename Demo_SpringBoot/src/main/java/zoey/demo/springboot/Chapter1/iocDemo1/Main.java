package zoey.demo.springboot.Chapter1.iocDemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zoey on 2018/4/3.
 */
public class Main {
    public static void main(String[] args){
        //1、声明容器  并接受一个配置类作为参数
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        //获得声明配置的bean
        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("di"));
        context.close();
    }

}
