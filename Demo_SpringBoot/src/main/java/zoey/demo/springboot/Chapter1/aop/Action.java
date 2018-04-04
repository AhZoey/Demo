package zoey.demo.springboot.Chapter1.aop;

import java.lang.annotation.*;

/**
 * Created by zoey on 2018/4/3.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
