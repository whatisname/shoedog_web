package com.xxy.shoedog.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author X
 * @package com.xxy.shoedog.entity
 * @date 8/18/2018 3:30 AM
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Data
public class User {
    private String uName;
    private String uEmail;
    private String uPassword;
    private Timestamp uCreateTime;
    @Id
    private String uId;
    private Timestamp uUpdateTime;
    private String uComment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uName, user.uName) &&
                Objects.equals(uEmail, user.uEmail) &&
                Objects.equals(uPassword, user.uPassword) &&
                Objects.equals(uCreateTime, user.uCreateTime) &&
                Objects.equals(uId, user.uId) &&
                Objects.equals(uUpdateTime, user.uUpdateTime) &&
                Objects.equals(uComment, user.uComment);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uName, uEmail, uPassword, uCreateTime, uId, uUpdateTime, uComment);
    }
}
