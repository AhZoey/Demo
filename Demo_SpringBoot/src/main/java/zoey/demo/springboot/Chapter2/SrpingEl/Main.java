package zoey.demo.springboot.Chapter2.SrpingEl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zoey on 2018/4/4.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ElConfig.class        );
        ElConfig resource=context.getBean(ElConfig.class);
        resource.outputResource();
        context.close();
    }
}
