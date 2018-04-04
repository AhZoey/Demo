package zoey.demo.springboot.Chapter1.iocDemo2;

/**
 * Created by zoey on 2018/4/3.
 * 功能类
 */
//没有注解
public class UseFunctionService {
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService){
        this.functionService=functionService;
    }
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
