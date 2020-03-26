package org.javaboy.vhr;

import com.mysql.cj.util.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VhrApplicationTests {

    @Test
    public void contextLoads() {

        ArrayList<String> list = new ArrayList<>();
        list.add("hjf");
        list.add("bxk");
        list.add("czp");
        list.add("drl");
        System.out.println("list = " + list);


        HashMap<String, String> map = new HashMap<>();
        map.put("hjf","fd");
    }

}
