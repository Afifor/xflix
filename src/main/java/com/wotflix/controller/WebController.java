package com.wotflix.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

 /*   @GetMapping("")
    public String protohome() {

        return "";
    }
*/

    @GetMapping("/login")
    public String protohome() {

        return "pages/login";
    }

    @GetMapping("/home")
    public String userhome() {

        return "pages/home";
    }

    @GetMapping("/signup")
    public String usersignup() {
        return "pages/signup";
    }


}
