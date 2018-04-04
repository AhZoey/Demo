package zoey.demo.springboot.Chapter2.SrpingEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zoey on 2018/4/4.
 */
@Service
public class DemoService {
    @Value("其他类的属性")//此处注入普通字符串
    private String another;
    public String getAnother(){
        return another;
    }
    public void setAnother(String another){
        this.another=another;
    }

}
