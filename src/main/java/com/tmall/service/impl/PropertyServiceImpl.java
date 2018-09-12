package com.tmall.service.impl;

import com.tmall.mapper.PropertyMapper;
import com.tmall.model.Property;
import com.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    PropertyMapper propertyMapper;


    @Override
    public boolean insert(Property property) {
        try {
            propertyMapper.insert(property);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            propertyMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Property get(int id) {
        return propertyMapper.get(id);
    }

    @Override
    public boolean update(Property property) {
        try {
            propertyMapper.update(property);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Property> list(int cid) {
        return propertyMapper.list(cid);
    }
}
