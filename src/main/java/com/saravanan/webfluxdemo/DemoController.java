package com.saravanan.webfluxdemo;

import org.apache.commons.text.CaseUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{firstname}/{lastname}")
    public String hello(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname){
        return "Hello "+ CaseUtils.toCamelCase(firstname, true, ' ')+" "+CaseUtils.toCamelCase(lastname, true, ' ')+", Welcome to Spring Flux World!";
    }

}
