package com.zanchen.develop.wordsdiary.service;

import com.zanchen.develop.wordsdiary.entity.Dictionary;

public interface IDictionaryService {
    Dictionary queryWords(String wordname);
}
