package com.example.demo;

import java.util.*;
import com.example.demo.model.Alienrepo;
import com.example.demo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcUsingSpringbootApplication {

	public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(SpringJdbcUsingSpringbootApplication.class, args);
        Alien obj=context.getBean(Alien.class);
        obj.setId(1);
        obj.setName("Nitesh");
        obj.setTech("IT");

        Alienrepo obj1=context.getBean(Alienrepo.class);
        obj1.save(obj);

        List<Map<String,Object>> list=obj1.getAll();
        for(Map<String,Object> map:list){
            System.out.println(map);
        }


	}

}
