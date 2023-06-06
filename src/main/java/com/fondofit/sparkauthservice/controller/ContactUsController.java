package com.fondofit.sparkauthservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactUsController {

    @GetMapping("/contact")
    public String contact(){
        return "This is contact us page, further details coming soon.";
    }
}
