package zoey.demo.springboot.Chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/4.
 */
@Service
@Scope("prototype")//声明
public class DemoPrototypeService {
}
