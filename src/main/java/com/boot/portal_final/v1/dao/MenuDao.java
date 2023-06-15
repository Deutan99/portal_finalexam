package com.boot.portal_final.v1.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDao {
    List<Map<String, Object>> doList();

    int doInsert(String strCoffee, String strKind, String strPrice);

    int doDelete(String strNO);

    Map<String, Object> doListOne(String strNO);

    //update
    int doUpdate(String strNo, String strCoffee, String strKind, String strPrice);
}
