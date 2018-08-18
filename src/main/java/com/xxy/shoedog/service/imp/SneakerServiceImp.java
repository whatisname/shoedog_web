package com.xxy.shoedog.service.imp;

import com.xxy.shoedog.dao.SneakerDao;
import com.xxy.shoedog.entity.Sneaker;
import com.xxy.shoedog.service.intf.SneakerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author X
 * @package com.xxy.shoedog.service.imp
 * @date 8/18/2018 4:22 AM
 */
@Service
@Slf4j
public class SneakerServiceImp implements SneakerService {
    @Autowired
    private SneakerDao sneakerDao;

    @Override
    public Sneaker add(Sneaker sneaker) {
        return sneakerDao.save(sneaker);
    }

    @Override
    public Boolean update(Sneaker sneaker) {
        sneakerDao.save(sneaker);
        return true;
    }

    @Override
    public Boolean delete(Sneaker sneaker) {
        sneakerDao.delete(sneaker);
        return true;
    }

    @Override
    public Sneaker findById(String sneakerId) {

        return sneakerDao.findSneakerBySId(sneakerId);
    }

    @Override
    public Page<Sneaker> findAll(Pageable pageable) {

        return sneakerDao.findAll(pageable);
    }

    @Override
    public Page<Sneaker> findByNameContains(String name, Pageable pageable) {

        return sneakerDao.findSneakersBySNameContains(name, pageable);
    }

    @Override
    public Page<Sneaker> findByBrandContains(String brand, Pageable pageable) {

        return sneakerDao.findSneakersBySBrandContains(brand, pageable);
    }

}
