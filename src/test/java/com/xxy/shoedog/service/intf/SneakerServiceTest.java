package com.xxy.shoedog.service.intf;

import com.xxy.shoedog.entity.Sneaker;
import com.xxy.shoedog.enums.SneakerLowHigh;
import com.xxy.shoedog.utils.KeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author X
 * @package com.xxy.shoedog.service.intf
 * @date 8/18/2018 4:27 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SneakerServiceTest {

    @Autowired
    private SneakerService sneakerService;

    @Test
    public void addSneaker() {
        Sneaker sneaker = new Sneaker();
        sneaker.setSId(KeyUtil.generateUniqueKeyId());
        sneaker.setSName("Nike LeBron 14");
        sneaker.setSBrand("Nike");
        sneaker.setSSeries("LeBron");
        sneaker.setSVersion("14");
        sneaker.setSLowHigh(SneakerLowHigh.LOW.getCode());
        sneakerService.addSneaker(sneaker);
    }

    @Test
    public void updateSneaker() {
    }

    @Test
    public void deleteSneaker() {
    }

    @Test
    public void findSneakerById() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findSneakerByNameContains() {
    }

    @Test
    public void findSneakerByBrandContains() {
    }
}