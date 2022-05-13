package com.zanchen.develop.wordsdiary.controller;

import com.zanchen.develop.wordsdiary.entity.Login;
import com.zanchen.develop.wordsdiary.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    private Login login(@RequestBody Login login){
        return iLoginService.login(login.getUsername(),login.getPassword());
    }
}
