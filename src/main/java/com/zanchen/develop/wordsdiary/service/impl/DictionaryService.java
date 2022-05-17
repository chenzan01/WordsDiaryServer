package com.zanchen.develop.wordsdiary.service.impl;

import com.zanchen.develop.wordsdiary.dao.IDictionaryDao;
import com.zanchen.develop.wordsdiary.entity.Dictionary;
import com.zanchen.develop.wordsdiary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    private IDictionaryDao iDictionaryDao;

    @Override
    public Dictionary queryWords(String wordname) {
        return iDictionaryDao.queryWords(wordname);
    }
}
