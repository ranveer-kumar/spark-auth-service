package com.fondofit.sparkauthservice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
//@RequestMapping("/api")
public class ToDoController {


    @GetMapping("/todos")
    public String getAllToDoList(){
            SecurityContext context = SecurityContextHolder.getContext();
    Authentication authentication = context.getAuthentication();
        String username = authentication.getName();
        Object principal = authentication.getPrincipal();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//        return "All to do list is here. username: "+username +" principals: "+principal + " authorities: "+authorities    ;
        return "All to do list is here. username : "+username + " authorities: "+ authorities;
    }
}
