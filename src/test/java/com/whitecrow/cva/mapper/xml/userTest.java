package com.whitecrow.cva.mapper.xml;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class userTest {

    @Resource user user;
    @Test
    public void testTeam(){
        user.findTeam(1L);

    }
}