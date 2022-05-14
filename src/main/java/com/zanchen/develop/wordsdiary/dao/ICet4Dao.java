package com.zanchen.develop.wordsdiary.dao;

import com.zanchen.develop.wordsdiary.entity.Cet4;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICet4Dao {
    int queryWordsTotalAmount();

    int queryWordsStudyAmount();
}
