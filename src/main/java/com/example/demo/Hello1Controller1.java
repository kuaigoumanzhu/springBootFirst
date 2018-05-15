package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 这里使用RestController等价于（@Controller和@RequestBody）
 */
@RestController
public class Hello1Controller1 {
    /**
     * 在这里使用@RequestMapping建立请求映射
     * @return
     */
    @RequestMapping("/sayHello")
    public String sayHello(){
        return  "sayHello";
    }

    /**
     * spring boot 默认使用的解析框架是jackson
     * @return
     */
    @GetMapping(value = "getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("王五");
        demo.setCreateTime(new Date());
        return demo;
    }
}
