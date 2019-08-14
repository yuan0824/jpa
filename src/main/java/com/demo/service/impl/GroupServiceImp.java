package com.demo.service.impl;

import com.demo.model.TGroup;
import com.demo.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuan
 */
@Service
public class GroupServiceImp {
    @Autowired
    private GroupRepository repository;

    public List<TGroup> findAll() {
        return repository.findAll();
    }
}
