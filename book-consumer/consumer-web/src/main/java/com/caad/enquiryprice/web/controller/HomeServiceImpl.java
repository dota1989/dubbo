package com.caad.enquiryprice.web.controller;

import com.book.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangbin on 2017/10/16.
 */
@Component
public class HomeServiceImpl implements HomeService {

    @Autowired(required = false)
    private DemoService demoService;

    public void login(){
        String result = demoService.sayHello("zhangsan");
        System.out.println(result);
    }

}
