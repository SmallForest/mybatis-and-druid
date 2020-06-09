package com.example.mybatisanddruid.mapper;

import java.util.Map;

public interface MemberMapper {
    /**
     * 根据ID获取记录
     *
     * @param id
     * @return
     */
     Map findObjectById(Integer id);
}