package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.*;

@Repository
public class Alienrepo {

    @Autowired
    private JdbcTemplate jd;

    public void save(Alien obj){
        String sql="insert into alien (id,name,tech) values (?,?,?)";
        jd.update(sql,obj.getId(),obj.getName(),obj.getTech());
    }

    public List<Map<String,Object>> getAll(){
        String sql="select * from alien";
        return jd.queryForList(sql);
    }
    /*
    public void createTable(){
        String sql="create table student (" +
                    "id int,"+
                    "name varchar(20)," +
                    "tech varchar(20) )";
        jd.execute(sql);
    }

     */

}
