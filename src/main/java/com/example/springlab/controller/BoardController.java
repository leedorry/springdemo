package com.example.springlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String ListGet(){
        return "/board/listForm";
    }

    @GetMapping("/write")
    public String WriteGet(){
        System.out.println("=======================");
        System.out.println("WriteGet");
        return "/board/writeForm";
    }

    @PostMapping("/writePost")
    public String WritePost(){
        return "/board/writeSuccess";
    }

}
