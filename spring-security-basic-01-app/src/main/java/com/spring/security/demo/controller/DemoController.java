/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Dell
 */
@Controller
@RequestMapping({"/hello" , "/"})
public class DemoController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String showHome(){
        return "index";
    }
}
