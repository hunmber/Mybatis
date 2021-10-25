package com.example.demo.service;

import com.example.demo.bean.Website;
import  com.example.demo.mapper.WebMapper;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {
    @Autowired
    WebMapper webMapper;

    public List<Website> getAllWebsites() {
        return webMapper.getAllWebsites();
    }
}

