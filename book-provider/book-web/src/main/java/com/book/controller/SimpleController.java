package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.book.api.DemoService;

/**
 * Created by zhangbin on 2017/9/8.
 */
@Controller
public class SimpleController {
    @Autowired
    private DemoService DemoService;

    @RequestMapping("/simpleMethod")
    public ModelAndView simpleMethod(){
        String name = "zhangsan";
        String message = DemoService.sayHello(name);
        ModelAndView view = new ModelAndView();
        view.addObject(message,message);
        view.setViewName("hello");
        return view;
    }
}
