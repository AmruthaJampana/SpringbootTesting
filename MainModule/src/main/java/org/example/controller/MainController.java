package org.example.controller;

import org.example.model.PingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
    @GetMapping("/ping")
    public String ping() {
        return "success";
    }

    @GetMapping("/ping2")
    public PingResponse ping2(){

        PingResponse response = new PingResponse();
        response.setStatus("sucess");
        response.setAction("abcd");
        return response;
    }
}
