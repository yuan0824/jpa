package com.demo.service.imp;

import com.demo.model.TGroup;
import com.demo.service.impl.GroupServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yuan
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupServiceImpTest {
    @Autowired
    private GroupServiceImp groupService;

    @Test
    public void findAll(){
        List<TGroup> list= groupService.findAll();
        System.out.println(list);
    }
}
