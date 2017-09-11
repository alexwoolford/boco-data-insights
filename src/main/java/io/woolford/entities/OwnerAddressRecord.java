package io.woolford.entities;


import com.univocity.parsers.annotations.Format;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Trim;

import java.util.Date;

public class OwnerAddressRecord {

    @Format(formats = {"MM/dd/yyyy"})
    @Parsed(field = "CreatedDate")
    private Date createdDate;

    @Trim
    @Parsed(field = "strap")
    private String strap;

    @Parsed(field = "folio")
    private String folio;

    @Trim
    @Parsed(field = "status_cd")
    private String statusCd;

    @Parsed(field = "bld_num")
    private String bldNum;

    @Parsed(field = "str_num")
    private String strNum;

    @Parsed(field = "str")
    private String str;

    @Parsed(field = "str_pfx")
    private String strPfx;

    @Parsed(field = "str_sfx")
    private String strSfx;

    @Parsed(field = "str_unit")
    private String strUnit;

    @Parsed(field = "city")
    private String city;

    @Parsed(field = "sub_code")
    private Integer subCode;

    @Parsed(field = "sub_dscr")
    private String subDscr;

    @Trim
    @Parsed(field = "section")
    private String section;

    @Trim
    @Parsed(field = "township")
    private String township;

    @Trim
    @Parsed(field = "range")
    private String range;

    @Trim
    @Parsed(field = "block")
    private String block;

    @Trim
    @Parsed(field = "lot")
    private String lot;

    @Parsed(field = "owner_name")
    private String ownerName;

    @Parsed(field = "mail_to")
    private String mailTo;

    @Parsed(field = "mailingAddr1")
    private String mailingAddr1;

    @Parsed(field = "mailingAddr2")
    private String mailingAddr2;

    @Parsed(field = "mailingCity")
    private String mailingCity;

    @Parsed(field = "mailingState")
    private String mailingState;

    @Parsed(field = "mailingZip")
    private String mailingZip;

    @Parsed(field = "mailingCountry")
    private String mailingCountry;

    @Parsed(field = "role_cd")
    private String roleCd;

    @Parsed(field = "pct_own")
    private Float pctOwn;

    @Parsed(field = "taxArea")
    private String taxArea;

    @Parsed(field = "nh")
    private Float nh;

    @Parsed(field = "mill_levy")
    private Float millLevy;

    @Parsed(field = "legalDscr")
    private String legalDscr;

    @Parsed(field = "waterFee")
    private Float waterFee;

    @Parsed(field = "account_type")
    private String accountType;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getBldNum() {
        return bldNum;
    }

    public void setBldNum(String bldNum) {
        this.bldNum = bldNum;
    }

    public String getStrNum() {
        return strNum;
    }

    public void setStrNum(String strNum) {
        this.strNum = strNum;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStrPfx() {
        return strPfx;
    }

    public void setStrPfx(String strPfx) {
        this.strPfx = strPfx;
    }

    public String getStrSfx() {
        return strSfx;
    }

    public void setStrSfx(String strSfx) {
        this.strSfx = strSfx;
    }

    public String getStrUnit() {
        return strUnit;
    }

    public void setStrUnit(String strUnit) {
        this.strUnit = strUnit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSubCode() {
        return subCode;
    }

    public void setSubCode(Integer subCode) {
        this.subCode = subCode;
    }

    public String getSubDscr() {
        return subDscr;
    }

    public void setSubDscr(String subDscr) {
        this.subDscr = subDscr;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailingAddr1() {
        return mailingAddr1;
    }

    public void setMailingAddr1(String mailingAddr1) {
        this.mailingAddr1 = mailingAddr1;
    }

    public String getMailingAddr2() {
        return mailingAddr2;
    }

    public void setMailingAddr2(String mailingAddr2) {
        this.mailingAddr2 = mailingAddr2;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    public Float getPctOwn() {
        return pctOwn;
    }

    public void setPctOwn(Float pctOwn) {
        this.pctOwn = pctOwn;
    }

    public String getTaxArea() {
        return taxArea;
    }

    public void setTaxArea(String taxArea) {
        this.taxArea = taxArea;
    }

    public Float getNh() {
        return nh;
    }

    public void setNh(Float nh) {
        this.nh = nh;
    }

    public Float getMillLevy() {
        return millLevy;
    }

    public void setMillLevy(Float millLevy) {
        this.millLevy = millLevy;
    }

    public String getLegalDscr() {
        return legalDscr;
    }

    public void setLegalDscr(String legalDscr) {
        this.legalDscr = legalDscr;
    }

    public Float getWaterFee() {
        return waterFee;
    }

    public void setWaterFee(Float waterFee) {
        this.waterFee = waterFee;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "OwnerAddressRecord{" +
                "createdDate=" + createdDate +
                ", strap='" + strap + '\'' +
                ", folio='" + folio + '\'' +
                ", statusCd='" + statusCd + '\'' +
                ", bldNum='" + bldNum + '\'' +
                ", strNum='" + strNum + '\'' +
                ", str='" + str + '\'' +
                ", strPfx='" + strPfx + '\'' +
                ", strSfx='" + strSfx + '\'' +
                ", strUnit='" + strUnit + '\'' +
                ", city='" + city + '\'' +
                ", subCode=" + subCode +
                ", subDscr='" + subDscr + '\'' +
                ", section='" + section + '\'' +
                ", township='" + township + '\'' +
                ", range='" + range + '\'' +
                ", block='" + block + '\'' +
                ", lot='" + lot + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", mailTo='" + mailTo + '\'' +
                ", mailingAddr1='" + mailingAddr1 + '\'' +
                ", mailingAddr2='" + mailingAddr2 + '\'' +
                ", mailingCity='" + mailingCity + '\'' +
                ", mailingState='" + mailingState + '\'' +
                ", mailingZip='" + mailingZip + '\'' +
                ", mailingCountry='" + mailingCountry + '\'' +
                ", roleCd='" + roleCd + '\'' +
                ", pctOwn=" + pctOwn +
                ", taxArea='" + taxArea + '\'' +
                ", nh=" + nh +
                ", millLevy=" + millLevy +
                ", legalDscr='" + legalDscr + '\'' +
                ", waterFee=" + waterFee +
                ", accountType='" + accountType + '\'' +
                '}';
    }

}
