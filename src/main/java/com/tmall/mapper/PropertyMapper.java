package com.tmall.mapper;

import com.tmall.model.Property;

import java.util.List;

public interface PropertyMapper {
    int insert(Property property);

    int delete(int id);

    Property get(int id);

    int update(Property property);

    List<Property> list(int cid);
}
