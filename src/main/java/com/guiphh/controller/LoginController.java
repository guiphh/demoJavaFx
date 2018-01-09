package com.guiphh.controller;

import com.guiphh.config.StageManager;
import com.guiphh.service.Impl.MyService;
import com.guiphh.views.FxmlView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LoginController {

    public Button loginbutton;
    private final MyService myService;

    public LoginController(MyService myService) {
        this.myService = myService;
    }

    @Lazy
    @Autowired
    private StageManager stageManager;


    public void login(ActionEvent actionEvent) {
        myService.sayHello();
        stageManager.switchScene(FxmlView.USER);
    }
}
