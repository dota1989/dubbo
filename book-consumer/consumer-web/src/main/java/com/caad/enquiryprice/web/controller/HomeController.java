package com.caad.enquiryprice.web.controller;

import com.book.api.DemoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by zhangbin on 2017/10/11.
 */
@Controller
public class HomeController {

    private static final Log log = LogFactory.getLog(HomeController.class);

    @Autowired
    private HomeService homeService;
    @Autowired(required = false)
    private DemoService demoService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        log.info("login method start!");

        homeService.login();
        String result = demoService.sayHello("lisi");
        System.out.println(result);

        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }
}
