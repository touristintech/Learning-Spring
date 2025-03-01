package com.nitzbits.springbootswagger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/status")
public class StatusController {

    @GetMapping("/")
    public Map<String, String> getApplicationStatus() {
        return Map.of("Status", "Success", "Message", "The application is up and running.!");
    }
}
