package zoey.demo.springboot.Chapter2.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by zoey on 2018/4/4.
 */
//事件监听类
//实现接口并指定监听的事件类型
public class DemoListener implements ApplicationListener<DemoEvent>{
    ///使用onApplicationEvent方法对消息进行接收
    public void onApplicationEvent(DemoEvent event) {
        String msg=event.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-DemoPulisher发布的消息："+msg);
    }
}
