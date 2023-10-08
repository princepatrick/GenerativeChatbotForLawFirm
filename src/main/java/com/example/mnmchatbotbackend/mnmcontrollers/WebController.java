package com.example.mnmchatbotbackend.mnmcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String login(){
        return "index";
    }

    @GetMapping("/case-lists/")
    public String caseLists(){
        return "case_lists";
    }

    @GetMapping("/case-file/")
    public String caseFile(){
        return "case_file";
    }

}
