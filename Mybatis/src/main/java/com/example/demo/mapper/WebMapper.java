package com.example.demo.mapper;

import com.example.demo.bean.Website;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper

public interface WebMapper {
    List<Website> getAllWebsites();
}
