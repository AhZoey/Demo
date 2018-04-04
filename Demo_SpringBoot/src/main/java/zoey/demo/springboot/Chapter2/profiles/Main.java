package zoey.demo.springboot.Chapter2.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zoey on 2018/4/4.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext();
        //将活动的Profile设置为prod
        context.getEnvironment().setActiveProfiles("dev");
        //后注册bean的配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);
        context.refresh();//刷新容器
        DemoBean demoBean=context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
