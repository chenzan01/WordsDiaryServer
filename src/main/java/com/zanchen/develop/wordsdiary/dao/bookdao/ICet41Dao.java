package com.zanchen.develop.wordsdiary.dao.bookdao;

import org.springframework.stereotype.Repository;

@Repository
public interface ICet41Dao {
    int queryWordsTotalAmount();

    int queryWordsStudyAmount();
}
