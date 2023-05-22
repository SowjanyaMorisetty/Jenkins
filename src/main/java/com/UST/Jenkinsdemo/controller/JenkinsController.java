package com.UST.Jenkinsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @GetMapping("/a")
    public String getDetails()
    {
        return "welcome to jenkins";
    }
}
