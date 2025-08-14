package com.example.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse Hello() {
        return new HelloResponse("Hello World");
    }
    @GetMapping("/hello/{anythingDynamicUsingPV}")
    public HelloResponse HelloDynamic(@PathVariable String anythingDynamicUsingPV) {
        return new HelloResponse("Hello " + anythingDynamicUsingPV);
    }
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello "+name+"!");
    }
}
