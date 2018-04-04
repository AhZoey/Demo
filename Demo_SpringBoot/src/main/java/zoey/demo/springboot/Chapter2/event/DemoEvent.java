package zoey.demo.springboot.Chapter2.event;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

/**
 * Created by zoey on 2018/4/4.
 */
//自定义事件
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID=1L;
    private String msg;
    public DemoEvent(Object source,String msg){
        super(source);
        this.msg=msg;
    }
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg=msg;
    }

}
