package zoey.demo.springboot.Chapter1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by zoey on 2018/4/3.
 */
//声明一个切面
@Aspect
//成为spring容器管理的bean
@Component
public class LogAspect {
    //声明切点
    @Pointcut("@annotation(zoey.demo.springboot.Chapter1.aop.Action)")
    public void annotationPointCut(){}
    //声明一个建言，斌使用@PointCut定义切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        //通过反射可获得注解的属性，然后日志记录相关的操作
        System.out.println("注解式拦截"+action.name());
    }
    //声明一个建言，此建言直接使用拦截规则作为参数
    @Before("execution(* zoey.demo.springboot.Chapter1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方法规则式拦截："+method.getName());
    }
}
