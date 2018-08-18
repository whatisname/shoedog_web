package com.xxy.shoedog.service.intf;

import com.xxy.shoedog.entity.Img;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author X
 * @package com.xxy.shoedog.service.intf
 * @date 8/18/2018 5:20 AM
 */
public interface ImgService {
    Page<Img> findAll(Pageable pageable);
    Img findById(String imgId);
    Page<Img> findAllBySneakerId(String sneakerId, Pageable pageable);

    Img add(Img img);
    Boolean update(Img img);
    Boolean delete(Img img);

}
