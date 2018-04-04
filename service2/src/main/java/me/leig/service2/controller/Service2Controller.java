package me.leig.service2.controller;

import me.leig.service2.client.Service1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leig
 */

@RestController
public class Service2Controller {

    @Autowired
    private Service1Client mService1Client;

    @GetMapping("/test/{value}")
    public String test(@PathVariable String value) {
        return mService1Client.test(value);
    }
}
