package io.sboot.vers.mgtut.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello") //default way of mapping to a GET http method
    public String sayHi() {
        return "Hi";
    }
}
