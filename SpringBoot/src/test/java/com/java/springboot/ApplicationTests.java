package com.java.springboot;

import com.java.springboot.dao.GetSC;
import com.java.springboot.dao.result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class ApplicationTests {
@Autowired
    GetSC test;
    @Test
    void contextLoads() {
        List<result>test1=test.resul();
        test1.forEach(System.out::println);
    }

}
