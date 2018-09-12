package com.tmall.service;

import com.tmall.model.Property;

import java.util.List;

public interface PropertyService {

    boolean insert(Property property);

    boolean delete(int id);

    Property get(int id);

    boolean update(Property property);

    List<Property> list(int cid);
}
