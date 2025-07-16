package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @Autowired
    TestClass tc;

    @GetMapping("api")
    public String sayHello(){
//        tc.func();
        return tc.func();
    }

//    @GetMapping("/")
//    public String func(){
//        return sayHello();
//
//    }
}
