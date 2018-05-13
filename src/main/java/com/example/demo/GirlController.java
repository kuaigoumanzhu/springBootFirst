package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private IGrilRepository grilRepository;
    @Autowired
    private GirlService girlService;

    /**
     * 查询
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return  grilRepository.findAll();
    }

    /**
     * 添加
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl=new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return  grilRepository.save(girl);
    }
    /**
     * 查询一个
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return  grilRepository.getOne(id);
    }
    /**
     * 修改
     */
    @PutMapping(value = "girls/{id}")
    public  Girl updateGirl(@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return grilRepository.save(girl);
    }
    /**
     * 删除
     */
    @DeleteMapping(value = "/girls/{id}")
    public  void girlDelete(@PathVariable("id") Integer id) {
        grilRepository.deleteById(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return  grilRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public  void girlTwo(){
        girlService.InsertTwo();
    }
}
