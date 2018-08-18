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
public class Img {
    @Id
    private String iId;
    private String iUrl;
    private int iSequence;
    private String iDescription;
    private String iComment;
    private Timestamp iCreateTime;
    private Timestamp iUpdateTime;
    private String sId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Img img = (Img) o;
        return iSequence == img.iSequence &&
                Objects.equals(iId, img.iId) &&
                Objects.equals(iUrl, img.iUrl) &&
                Objects.equals(iDescription, img.iDescription) &&
                Objects.equals(iComment, img.iComment) &&
                Objects.equals(iCreateTime, img.iCreateTime) &&
                Objects.equals(iUpdateTime, img.iUpdateTime) &&
                Objects.equals(sId, img.sId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(iId, iUrl, iSequence, iDescription, iComment, iCreateTime, iUpdateTime, sId);
    }
}
