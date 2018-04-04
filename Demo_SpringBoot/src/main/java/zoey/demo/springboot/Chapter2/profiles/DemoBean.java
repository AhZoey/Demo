package zoey.demo.springboot.Chapter2.profiles;

/**
 * Created by zoey on 2018/4/4.
 */
public class DemoBean {
    private String content;
    private DemoBean(){
        super();
    }
    public DemoBean(String content){
        super();
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
}
