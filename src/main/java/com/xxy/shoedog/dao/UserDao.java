package com.xxy.shoedog.dao;

import com.xxy.shoedog.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author X
 * @package com.xxy.shoedog.dao
 * @date 8/18/2018 5:07 AM
 */
public interface UserDao extends JpaRepository<User, String> {
    Page<User> findAll(Pageable pageable);
    User findUserByUId(String userId);
    User findUserByUEmail(String email);
}
