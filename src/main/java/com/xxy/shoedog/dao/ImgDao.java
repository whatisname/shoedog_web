package com.xxy.shoedog.dao;

import com.xxy.shoedog.entity.Img;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author X
 * @package com.xxy.shoedog.dao
 * @date 8/18/2018 5:12 AM
 */
public interface ImgDao extends JpaRepository<Img, String> {
    Page<Img> findAll(Pageable pageable);
    Page<Img> findAllBySId(String sneakerId, Pageable pageable);

    Img findImgByIId(String imgId);
}
