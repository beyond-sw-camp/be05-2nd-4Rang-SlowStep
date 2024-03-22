package com.example.slowstep_pjt.pm.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.pm.domain.PmRmRequest;

@Mapper
public interface PmRmMapper {
    public Integer findPmRmNo(PmRmRequest params);
}
