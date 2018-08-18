package com.xxy.shoedog.dao;

import com.sun.webkit.PageCache;
import com.xxy.shoedog.entity.Sneaker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author X
 * @package com.xxy.shoedog.dao
 * @date 8/18/2018 3:41 AM
 */

public interface SneakerDao extends JpaRepository<Sneaker, String>{
    Page<Sneaker> findAll(Pageable pageable);
    Sneaker findSneakerBySId(String sneakerId);
    Page<Sneaker> findSneakersBySNameContains(String name, Pageable pageable);
    Page<Sneaker> findSneakersBySBrandContains(String brand, Pageable pageable);
}
