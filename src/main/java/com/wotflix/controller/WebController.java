package com.wotflix.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping("/login")
    public String protohome() {

        return "pages/login";
    }


}
