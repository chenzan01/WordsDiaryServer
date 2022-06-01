package com.zanchen.develop.wordsdiary.service.impl.bookimpl;

import com.zanchen.develop.wordsdiary.dao.bookdao.ICet41Dao;
import com.zanchen.develop.wordsdiary.service.bookservice.ICet41Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cet41Service implements ICet41Service {
    @Autowired
    private ICet41Dao iCet41Dao;

    @Override
    public int queryWordsTotalAmount() {
        return iCet41Dao.queryWordsTotalAmount();
    }

    @Override
    public int queryWordsStudyAmount() {
        return iCet41Dao.queryWordsStudyAmount();
    }


}
