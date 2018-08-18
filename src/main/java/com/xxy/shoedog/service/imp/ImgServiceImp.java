package com.xxy.shoedog.service.imp;

import com.xxy.shoedog.dao.ImgDao;
import com.xxy.shoedog.entity.Img;
import com.xxy.shoedog.service.intf.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author X
 * @package com.xxy.shoedog.service.imp
 * @date 8/18/2018 5:29 AM
 */
@Service
public class ImgServiceImp implements ImgService {

    @Autowired
    private ImgDao imgDao;

    @Override
    public Page<Img> findAll(Pageable pageable) {
        return imgDao.findAll(pageable);
    }

    @Override
    public Img findById(String imgId) {
        return imgDao.findImgByIId(imgId);
    }

    @Override
    public Page<Img> findAllBySneakerId(String sneakerId, Pageable pageable) {
        return imgDao.findAllBySId(sneakerId, pageable);
    }

    @Override
    public Img add(Img img) {
        return imgDao.save(img);
    }

    @Override
    public Boolean update(Img img) {
        imgDao.save(img);
        return true;
    }

    @Override
    public Boolean delete(Img img) {
        imgDao.delete(img);
        return true;
    }
}
