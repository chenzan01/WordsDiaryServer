package com.zanchen.develop.wordsdiary.service.impl;

import com.zanchen.develop.wordsdiary.dao.ILoginDao;
import com.zanchen.develop.wordsdiary.entity.Login;
import com.zanchen.develop.wordsdiary.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public Login login(String username, String password) {
        return iLoginDao.login(username,password);
    }
}
