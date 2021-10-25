package com.example.demo.controller;
import com.example.demo.bean.Website;
import com.example.demo.bean.DataLink;
import com.example.demo.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@RestController
public class WebController {
    @Autowired
    private WebService webService;

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Website> get(){
        Connection conn= DataLink.getConn();
        if(conn!=null){
            String sql="select name from account";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet results = pst.executeQuery();
                while (results.next()){
                    System.out.println(results.getString("name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return webService.getAllWebsites();
    }

}

