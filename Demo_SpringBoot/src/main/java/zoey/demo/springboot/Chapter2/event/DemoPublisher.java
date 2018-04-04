package zoey.demo.springboot.Chapter2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by zoey on 2018/4/4.
 */
//事件发布类
@Component
public class DemoPublisher{
    @Autowired
    ApplicationContext applicationContext;//注入ApplicationContext来发布事件
    public void publish(String msg){
        //使用publishEvent来发布
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
