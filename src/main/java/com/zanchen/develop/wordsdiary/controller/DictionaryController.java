package com.zanchen.develop.wordsdiary.controller;

import com.zanchen.develop.wordsdiary.entity.Dictionary;
import com.zanchen.develop.wordsdiary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dictionary")
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;
    @RequestMapping(value = "/queryWords",method = RequestMethod.POST)
    private Dictionary queryWords(@RequestBody Dictionary dictionary){
        return iDictionaryService.queryWords(dictionary.getWordname());
    }
}
