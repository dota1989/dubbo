package com.caad.enquiryprice.web.controller;

/**
 * Created by zhangbin on 2017/10/20.
 */
import com.book.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        String hello = demoService.sayHello("zhangfei"); // execute remote invocation
        System.out.println(hello); // show the result
    }
}
