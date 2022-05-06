package com.zanchen.develop.wordsdiary.dao;

import com.zanchen.develop.wordsdiary.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {
    Login login(@Param("username") String username, @Param("password") String password);


}
