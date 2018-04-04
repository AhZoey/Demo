package zoey.demo.springboot.Chapter2.scope;

import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/4.
 */
@Service
//默认为Singleton,相当于@Scope("singleton")
public class DemoSingletonService {
}
