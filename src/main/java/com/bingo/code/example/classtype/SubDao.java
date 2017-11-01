package com.bingo.code.example.classtype;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class BaseDao <T>{
    public void getType(){
        Type t = getClass().getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) t ;
        System.out.println(p.getActualTypeArguments()[0]);
    }
}

public class SubDao extends BaseDao<String> {
    public static void main(String[] args) {
        SubDao subDao = new SubDao();
        subDao.getType();
    }
 }