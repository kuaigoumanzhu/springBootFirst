package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//    @Value("${age}")
//    private  Integer age;
//    @Value("${content}")
//    private String content;


    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value ="/say", method = RequestMethod.GET)
    public String say() {
        return  girlProperties.getCupSize();
    }

    @GetMapping(value ="/say1")
    public String say1() {
        return  girlProperties.getCupSize();
    }

    @RequestMapping(value = "/PathVar/{id}", method = RequestMethod.GET)
    public String PathVar(@PathVariable("id") Integer id){
        return  "id:" + id;
    }

    @RequestMapping(value = "/Param",method = RequestMethod.GET)
    public String Param(@RequestParam("id") Integer myId) {
        return "id:"+myId;
    }

    @RequestMapping(value = "/DefaultParam",method = RequestMethod.GET)
    public String DefaultParam(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id:"+myId;
    }
}
