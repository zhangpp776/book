package com.qf.service;

import com.qf.entity.Class;

import java.util.List;

public interface ClassService {

    public List<Class> findAllClass();

    public Class selClassById(Integer id);

    public int addClass(Class aClass);

    public int updateClassById(Class aClass);

    public int delClassById(Integer id);

}
