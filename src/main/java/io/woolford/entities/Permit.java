package io.woolford.entities;

import com.univocity.parsers.annotations.Format;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Trim;
import org.hibernate.annotations.NaturalId;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Permit {

    @Id
    @GeneratedValue
    private long id;

    @NaturalId
    @Trim
    @Parsed(field = "strap")
    private String strap;

    @Parsed(field = "issued_by")
    private String issuedBy;

    @NaturalId
    @Parsed(field = "permit_num")
    private String permitNum;

    @Parsed(field = "permit_category")
    private String permitCategory;

    @Format(formats = {"MM/dd/yyyy"})
    @Parsed(field = "issue_dt")
    private Date issueDt;

    @Parsed(field = "estimated_value")
    private Integer estimatedValue;

    @Parsed(field = "description")
    private String description;


    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getPermitNum() {
        return permitNum;
    }

    public void setPermitNum(String permitNum) {
        this.permitNum = permitNum;
    }

    public String getPermitCategory() {
        return permitCategory;
    }

    public void setPermitCategory(String permitCategory) {
        this.permitCategory = permitCategory;
    }

    public Date getIssueDt() {
        return issueDt;
    }

    public void setIssueDt(Date issueDt) {
        this.issueDt = issueDt;
    }

    public Integer getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Integer estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "strap='" + strap + '\'' +
                ", issuedBy='" + issuedBy + '\'' +
                ", permitNum='" + permitNum + '\'' +
                ", permitCategory='" + permitCategory + '\'' +
                ", issueDt=" + issueDt +
                ", estimatedValue=" + estimatedValue +
                ", description='" + description + '\'' +
                '}';
    }

}
