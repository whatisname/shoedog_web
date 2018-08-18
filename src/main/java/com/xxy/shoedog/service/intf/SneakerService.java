package com.xxy.shoedog.service.intf;

import com.xxy.shoedog.entity.Sneaker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author X
 * @package com.xxy.shoedog.service.intf
 * @date 8/18/2018 4:08 AM
 */
public interface SneakerService {
    Sneaker add(Sneaker sneaker);
    Boolean update(Sneaker sneaker);
    Boolean delete(Sneaker sneaker);

    Sneaker findById(String sneakerId);

    Page<Sneaker> findAll(Pageable pageable);

    Page<Sneaker> findByNameContains(String name, Pageable pageable);
    Page<Sneaker> findByBrandContains(String brand, Pageable pageable);
}
