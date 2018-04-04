package zoey.demo.springboot.Chapter2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zoey on 2018/4/4.
 */
public class JSR250WayService {
    @PostConstruct //在构造函数执行完之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService(){
        System.out.println("初始化构造函数JSR250WayService");
    }
    @PreDestroy //在bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
