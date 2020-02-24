package brainstation.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/hello"})
@CrossOrigin
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello Resource";
    }
}
