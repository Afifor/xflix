package com.wotflix.controller;

import com.wotflix.service.RegistrationRequest;
import com.wotflix.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);

    }
}
