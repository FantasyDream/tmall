package com.tmall.service;

import com.tmall.model.PropertyValue;

import java.util.List;

public interface PropertyValueService {

    boolean insert(PropertyValue propertyValue);

    boolean delete(int id);

    PropertyValue get(int id);

    boolean update(PropertyValue propertyValue);

    List<PropertyValue> listByPid(int pid);

    boolean deleteByPid(int pid);

    boolean deleteByPtid(int pid);
}
