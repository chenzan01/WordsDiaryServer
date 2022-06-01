package com.zanchen.develop.wordsdiary.controller.bookcontroller;

import com.zanchen.develop.wordsdiary.service.bookservice.ICet41Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cet4")
public class Cet41Controller {
    @Autowired
    private ICet41Service iCet41Service;

    @RequestMapping(value = "/queryWordsTotalAmount",method = RequestMethod.POST)
    private int queryWordsTotalAmount(){
        return iCet41Service.queryWordsTotalAmount();
    }

    @RequestMapping(value = "/queryWordsStudyAmount",method = RequestMethod.POST)
    private int queryWordsStudyAmount(){
        return iCet41Service.queryWordsStudyAmount();
    }

}
