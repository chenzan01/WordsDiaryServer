package com.zanchen.develop.wordsdiary.service;

import com.zanchen.develop.wordsdiary.entity.Login;

public interface ILoginService {
    Login login(String username, String password);
}
