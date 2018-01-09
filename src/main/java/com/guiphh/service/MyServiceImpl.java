package com.guiphh.service;

import com.guiphh.service.Impl.MyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class MyServiceImpl implements MyService {

    @Value("${app.name}")
    private String appName;

    public void sayHello() {
        System.out.println("HEllo from " + appName);
    }
}
