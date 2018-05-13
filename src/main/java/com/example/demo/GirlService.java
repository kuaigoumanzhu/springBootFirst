package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
    @Autowired
    private IGrilRepository girlRepo;

    @Transactional
    public void InsertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepo.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("D");
        girlB.setAge(20);
        girlRepo.save(girlB);
    }
}
