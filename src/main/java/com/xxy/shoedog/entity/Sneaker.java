package com.xxy.shoedog.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author X
 * @package com.xxy.shoedog.entity
 * @date 8/18/2018 3:30 AM
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Data
public class Sneaker {
    @Id
    private String sId;
    private String sName;
    private String sBrand;
    private String sVersion;
    private String sSeries;
    private String sOtherName;
    private String sComment;
    private Integer sLowHigh;
    private Timestamp sCreateTime;
    private Timestamp sUpdateTime;
    private Date sReleaseDate;
    private Integer sPrise;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sneaker sneaker = (Sneaker) o;
        return Objects.equals(sId, sneaker.sId) &&
                Objects.equals(sName, sneaker.sName) &&
                Objects.equals(sBrand, sneaker.sBrand) &&
                Objects.equals(sVersion, sneaker.sVersion) &&
                Objects.equals(sSeries, sneaker.sSeries) &&
                Objects.equals(sOtherName, sneaker.sOtherName) &&
                Objects.equals(sComment, sneaker.sComment) &&
                Objects.equals(sLowHigh, sneaker.sLowHigh) &&
                Objects.equals(sCreateTime, sneaker.sCreateTime) &&
                Objects.equals(sUpdateTime, sneaker.sUpdateTime) &&
                Objects.equals(sReleaseDate, sneaker.sReleaseDate) &&
                Objects.equals(sPrise, sneaker.sPrise);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sId, sName, sBrand, sVersion, sSeries, sOtherName, sComment, sLowHigh, sCreateTime, sUpdateTime, sReleaseDate, sPrise);
    }
}
