package zoey.demo.springboot.Chapter1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zoey on 2018/4/3.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
