package com.zanchen.develop.wordsdiary.controller;

import com.zanchen.develop.wordsdiary.entity.Login;
import com.zanchen.develop.wordsdiary.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    private Login login(@RequestParam String username,@RequestParam String password){
        return iLoginService.login(username, password);
    }
}
