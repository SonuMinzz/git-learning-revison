package com.sharon.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitLearning {


    @GetMapping("/message")
    public String message()
    {
        return "this is git learning revision !!";
    }
}
