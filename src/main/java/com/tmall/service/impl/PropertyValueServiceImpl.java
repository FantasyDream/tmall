package com.tmall.service.impl;

import com.tmall.mapper.PropertyValueMapper;
import com.tmall.model.PropertyValue;
import com.tmall.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyValueServiceImpl implements PropertyValueService {

    @Autowired
    PropertyValueMapper propertyValueMapper;

    @Override
    public boolean insert(PropertyValue propertyValue) {
        try {
            propertyValueMapper.insert(propertyValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            propertyValueMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public PropertyValue get(int id) {
        return propertyValueMapper.get(id);
    }

    @Override
    public boolean update(PropertyValue propertyValue) {
        try {
            propertyValueMapper.update(propertyValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<PropertyValue> listByPid(int pid) {
        return propertyValueMapper.listByPid(pid);
    }

    @Override
    public boolean deleteByPid(int pid) {
        try {
            propertyValueMapper.deleteByPid(pid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteByPtid(int ptid) {
        try {
            propertyValueMapper.deleteByPtid(ptid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
