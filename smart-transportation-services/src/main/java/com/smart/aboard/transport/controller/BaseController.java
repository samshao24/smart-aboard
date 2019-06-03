package com.smart.aboard.transport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "ping")
    @ResponseBody
    public String ping() {
        return "pong";
    }
}
