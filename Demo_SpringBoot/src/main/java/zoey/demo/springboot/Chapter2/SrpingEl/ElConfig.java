package zoey.demo.springboot.Chapter2.SrpingEl;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * Created by zoey on 2018/4/4.
 */
@Configuration
@ComponentScan("zoey.demo.springboot.Chapter2.SrpingEl")
//zoey/demo/springboot/Chapter2/SrpingEl/test.properties
@PropertySource("classpath:test.properties")
class ElConfig {
    @Value("I Love You!")//注入普通字符
    private String normal;
    @Value("#{systemProperties['os.name']}")//注入操作系统属性
    private String osName;
    @Value("#{ T(java.lang.Math).random()*100.0}")//注入表达式
    private double randomNumber;
    @Value("#{demoService.another}")//注入其他Bean的属性
    private String fromAnother;
    @Value("classpath:test.txt")//注入文件资源
    private Resource testFile;
    @Value("http://www.baidu.com")//注入网址资源
    private Resource tesstUrl;
    @Value("${book.name}")//注入配置文件
    private String bookName;
    @Autowired
    private Environment environment;
    public void outputResource(){
        try{
            System.out.println("normal:"+normal);
            System.out.println("osName:"+osName);
            System.out.println("randomNumber:"+randomNumber);
            System.out.println("fromAnother:"+fromAnother);
            System.out.println("testFile:"+ IOUtils.toString(testFile.getInputStream()));
            System.out.println("tesstUrl:"+IOUtils.toString(tesstUrl.getInputStream()));
            System.out.println("bookName:"+bookName);
            System.out.println("bookAuthor:"+environment.getProperty("book.author"));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
