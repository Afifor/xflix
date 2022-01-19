package com.wotflix.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping("/")
    public String protohome() {

        return "pages/home";
    }


}
