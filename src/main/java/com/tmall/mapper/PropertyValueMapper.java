package com.tmall.mapper;

import com.tmall.model.PropertyValue;

import java.util.List;

public interface PropertyValueMapper {

    int insert(PropertyValue propertyValue);

    int delete(int id);

    PropertyValue get(int id);

    int update(PropertyValue propertyValue);

    List<PropertyValue> listByPid(int pid);

    int deleteByPid(int pid);

    int deleteByPtid(int pid);
}
