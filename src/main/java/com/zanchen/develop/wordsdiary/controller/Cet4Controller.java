package com.zanchen.develop.wordsdiary.controller;

import com.zanchen.develop.wordsdiary.service.ICet4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cet4")
public class Cet4Controller {
    @Autowired
    private ICet4Service iCet4Service;

    @RequestMapping(value = "/queryWordsTotalAmount",method = RequestMethod.POST)
    private int queryWordsTotalAmount(){
        return iCet4Service.queryWordsTotalAmount();
    }

    @RequestMapping(value = "/queryWordsStudyAmount",method = RequestMethod.POST)
    private int queryWordsStudyAmount(){
        return iCet4Service.queryWordsStudyAmount();
    }

}
