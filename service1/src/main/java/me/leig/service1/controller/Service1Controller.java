package me.leig.service1.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author leig
 */

@RestController
public class Service1Controller {

    @GetMapping("/test/{value}")
    public String test(@PathVariable String value) {
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:SS").format(new Date()) + "[" + value +"]";
    }
}
