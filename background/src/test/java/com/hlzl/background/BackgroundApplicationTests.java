package com.hlzl.background;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class BackgroundApplicationTests {

    private String _string;

    BackgroundApplicationTests() {
        _string = "1234";
    }

    @Test
    void contextLoads() {
        System.out.println("Test content loading");

        System.out.println("Test content load over");
    }

    @Test
    public void StringContain() {
        Assert.hasText(_string, "12");
    }

}
