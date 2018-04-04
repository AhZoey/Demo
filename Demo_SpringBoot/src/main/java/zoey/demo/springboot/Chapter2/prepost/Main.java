package zoey.demo.springboot.Chapter2.prepost;

import com.sun.org.apache.bcel.internal.generic.JSR;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zoey on 2018/4/4.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrepostConfig.class);
        BeanWayService beanWayService=context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);
        context.close();
    }
}
