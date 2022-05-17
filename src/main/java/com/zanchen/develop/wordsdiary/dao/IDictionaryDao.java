package com.zanchen.develop.wordsdiary.dao;

import com.zanchen.develop.wordsdiary.entity.Dictionary;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDictionaryDao {
    Dictionary queryWords(@Param("wordname") String wordname);
}
