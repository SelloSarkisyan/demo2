package com.example.demo;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
//@Query(value = "SELECT 1 FROM DUAL",nativeQuery=true)
public class HWController {

    @GetMapping("/hello")
    public String index() throws SQLException {
        OracleConfiguration oc=new OracleConfiguration();
        oc.mySqlDataSource();

               return "Spring Boot Example!!";
    }
}
