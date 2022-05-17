package com.zanchen.develop.wordsdiary.service.impl;

import com.zanchen.develop.wordsdiary.dao.ICet4Dao;
import com.zanchen.develop.wordsdiary.entity.Cet4;
import com.zanchen.develop.wordsdiary.service.ICet4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cet4Service implements ICet4Service {
    @Autowired
    private ICet4Dao iCet4Dao;

    @Override
    public int queryWordsTotalAmount() {
        return iCet4Dao.queryWordsTotalAmount();
    }

    @Override
    public int queryWordsStudyAmount() {
        return iCet4Dao.queryWordsStudyAmount();
    }


}
