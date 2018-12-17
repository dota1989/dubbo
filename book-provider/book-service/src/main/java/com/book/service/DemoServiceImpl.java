package com.book.service;

import com.book.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by zhangbin on 2017/9/8.
 */
@Component("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "hello," + name;
    }
}
