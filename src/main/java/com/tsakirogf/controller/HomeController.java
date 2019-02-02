package com.tsakirogf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@RestController
public class HomeController
{
    @RequestMapping("/home")
    public String home()
    {
        return "Das Boot, reporting for duty.";
    }

    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/").setViewName("redirect:/index.html");
    }
}
