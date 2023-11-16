package com.hlzl.background.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlzl.background.data.People;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleDao extends BaseMapper<People> {}
