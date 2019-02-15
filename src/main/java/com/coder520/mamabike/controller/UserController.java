package com.coder520.mamabike.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 *
 * @author lq
 * @date  23:17
 */

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/hello")
    public String hello(){
        return "ok";
    }
}
