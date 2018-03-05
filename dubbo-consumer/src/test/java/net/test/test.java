package net.test;

import net.demo.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yc on 2018/3/5.
 */
public class test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("classpath:springmvc");
        context.start();
        DemoService demoService =(DemoService)context.getBean("demoService");
        System.out.println(demoService.sayHello("dubbo测试"));
    }
}
