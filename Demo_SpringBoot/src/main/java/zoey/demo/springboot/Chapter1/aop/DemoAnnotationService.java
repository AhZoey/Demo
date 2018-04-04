package zoey.demo.springboot.Chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/3.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
