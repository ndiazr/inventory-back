package com.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController
{
    @RequestMapping("/greeting")
    public String greeting()
    {
        return "hello Nigga!";
    }
}
