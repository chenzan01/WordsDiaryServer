package com.zanchen.develop.wordsdiary.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface ICet4Dao {
    int queryWordsTotalAmount();

    int queryWordsStudyAmount();
}
