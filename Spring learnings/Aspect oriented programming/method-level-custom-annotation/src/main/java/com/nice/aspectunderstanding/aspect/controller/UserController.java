package com.nice.aspectunderstanding.aspect.controller;

import com.nice.aspectunderstanding.aspect.custom.annotation.AuthorizeUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    /**
     * Method to validate if user is valid or not by using AuthorizeUser annotation.
     * @param user_id
     * @param servletRequest
     * @return
     */
    @GetMapping("/login")
    @AuthorizeUser
    public String login(@RequestParam Integer user_id, HttpServletRequest servletRequest) {
        return "Hello TechGeekNextUser : " + user_id;
    }
}
