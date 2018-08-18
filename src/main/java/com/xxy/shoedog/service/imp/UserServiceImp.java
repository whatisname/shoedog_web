package com.xxy.shoedog.service.imp;

import com.xxy.shoedog.dao.UserDao;
import com.xxy.shoedog.entity.User;
import com.xxy.shoedog.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author X
 * @package com.xxy.shoedog.service.imp
 * @date 8/18/2018 5:45 AM
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    @Override
    public User findById(String userId) {
        return userDao.findUserByUId(userId);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findUserByUEmail(email);
    }

    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    @Override
    public Boolean update(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public Boolean delete(User user) {
        userDao.delete(user);
        return true;
    }
}
