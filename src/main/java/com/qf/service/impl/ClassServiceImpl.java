package com.qf.service.impl;

import com.qf.dao.ClassMapper;
import com.qf.entity.Class;
import com.qf.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassMapper classMapper;

    @Override
    public List<Class> findAllClass() {
        return classMapper.findAllClass();
    }

    @Override
    public Class selClassById(Integer id) {
        return classMapper.selClassById(id);
    }

    @Override
    public int addClass(Class aClass) {
        return classMapper.addClass(aClass);
    }

    @Override
    public int updateClassById(Class aClass) {
        return classMapper.updateClassById(aClass);
    }

    @Override
    public int delClassById(Integer id) {
        return classMapper.delClassById(id);
    }
}
