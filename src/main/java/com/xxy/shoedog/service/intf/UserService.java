package com.xxy.shoedog.service.intf;

import com.xxy.shoedog.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author X
 * @package com.xxy.shoedog.service.intf
 * @date 8/18/2018 5:20 AM
 */
public interface UserService {
    Page<User> findAll(Pageable pageable);
    User findById(String userId);
    User findByEmail(String email);

    User add(User user);
    Boolean update(User user);
    Boolean delete(User user);
}
