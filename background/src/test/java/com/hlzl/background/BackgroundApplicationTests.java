package com.hlzl.background;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hlzl.background.dao.PeopleDao;

@SpringBootTest
class BackgroundApplicationTests {
    @Autowired
    private PeopleDao peopleDao;

    @Test
    void contextLoads() {

        // System.out.println(peopleDao.selectById(1));

    }

}
