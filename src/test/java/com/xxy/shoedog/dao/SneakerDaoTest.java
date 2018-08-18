package com.xxy.shoedog.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author X
 * @package com.xxy.shoedog.dao
 * @date 8/18/2018 3:51 AM
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SneakerDaoTest {
    @Autowired
    private SneakerDao sneakerDao;

    @Test
    public void findAll() {
        PageRequest request = PageRequest.of(0, 10);
        log.info("{}", sneakerDao.findAll());
    }

    @Test
    public void findSneakerBySId() {
        log.info("{}", sneakerDao.findSneakerBySId("1"));
    }

    @Test
    public void findSneakersBySNameContains() {
        log.info("{}", sneakerDao.findSneakersBySNameContains("1", PageRequest.of(0, 10)));
    }

    @Test
    public void findSneakersBySBrandContains() {
    }
}