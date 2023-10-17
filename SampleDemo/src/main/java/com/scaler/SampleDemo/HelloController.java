package com.scaler.SampleDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<Person> helloWorld()
    {
        String strHelloWorld = "Hello World";
        Person objP = new Person("Mrugesh",37,"I love my life");
        return  ResponseEntity.ok(objP);
    }
}
