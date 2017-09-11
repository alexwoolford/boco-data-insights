package io.woolford.entities;

import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Trim;


public class BuildingRecord {

    @Trim
    @Parsed(field = "strap")
    private String strap;

    @Trim
    @Parsed(field = "bld_num")
    private Integer bldNum;

    @Trim
    @Parsed(field = "section_num")
    private Integer sectionNum;

    @Trim
    @Parsed(field = "designCode")
    private String designCode;

    @Parsed(field = "designCodeDscr")
    private String designCodeDscr;

    @Parsed(field = "qualityCode")
    private String qualityCode;

    @Parsed(field = "qualityCodeDscr")
    private String qualityCodeDscr;

    @Parsed(field = "bldgClass")
    private String bldbldgClassNum;

    @Parsed(field = "bldgClassDscr")
    private String bldgClassDscr;

    @Parsed(field = "ConstCode")
    private String constCode;

    @Parsed(field = "ConstCodeDscr")
    private String constCodeDscr;

    @Parsed(field = "builtYear")
    private Integer builtYear;

    @Parsed(field = "CompCode")
    private String compCode;

    @Parsed(field = "EffectiveYear")
    private Integer effectiveYear;

    @Parsed(field = "bsmtSF")
    private String bsmtSF;

    @Parsed(field = "bsmtType")
    private String bsmtType;

    @Parsed(field = "bsmtTypeDscr")
    private String bsmtTypeDscr;

    @Parsed(field = "carStorageSF")
    private String carStorageSF;

    @Parsed(field = "carStorageType")
    private String carStorageType;

    @Parsed(field = "carStorageTypeDscr")
    private String carStorageTypeDscr;

    @Parsed(field = "nbrBedRoom")
    private Float nbrBedRoom;

    @Parsed(field = "nbrRoomsNobath")
    private Float nbrRoomsNobath;

    @Parsed(field = "mainfloorSF")
    private Float mainfloorSF;

    @Parsed(field = "nbrThreeQtrBaths")
    private Float nbrThreeQtrBaths;

    @Parsed(field = "nbrFullBaths")
    private Float nbrFullBaths;

    @Parsed(field = "nbrHalfBaths")
    private Float nbrHalfBaths;

    @Parsed(field = "TotalFinishedSF")
    private Float totalFinishedSF;

    @Parsed(field = "Ac")
    private String ac;

    @Parsed(field = "AcDscr")
    private String acDscr;

    @Parsed(field = "Heating")
    private String heating;

    @Parsed(field = "HeatingDscr")
    private String heatingDscr;

    @Parsed(field = "ExtWallPrim")
    private String extWallPrim;

    @Parsed(field = "ExtWallDscrPrim")
    private String extWallDscrPrim;

    @Parsed(field = "ExtWallSec")
    private String extWallSec;

    @Parsed(field = "ExtWallDscrSec")
    private String extWallDscrSec;

    @Parsed(field = "IntWall")
    private String intWall;

    @Parsed(field = "IntWallDscr")
    private String intWallDscr;

    @Parsed(field = "Roof_Cover")
    private String roofCover;

    @Parsed(field = "Roof_CoverDscr")
    private String roofCoverDscr;

    @Parsed(field = "Stories")
    private String stories;

    @Parsed(field = "UnitCount")
    private String unitCount;

    @Trim
    @Parsed(field = "status_cd")
    private String statusCd;

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public Integer getBldNum() {
        return bldNum;
    }

    public void setBldNum(Integer bldNum) {
        this.bldNum = bldNum;
    }

    public Integer getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(Integer sectionNum) {
        this.sectionNum = sectionNum;
    }

    public String getDesignCode() {
        return designCode;
    }

    public void setDesignCode(String designCode) {
        this.designCode = designCode;
    }

    public String getDesignCodeDscr() {
        return designCodeDscr;
    }

    public void setDesignCodeDscr(String designCodeDscr) {
        this.designCodeDscr = designCodeDscr;
    }

    public String getQualityCode() {
        return qualityCode;
    }

    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
    }

    public String getQualityCodeDscr() {
        return qualityCodeDscr;
    }

    public void setQualityCodeDscr(String qualityCodeDscr) {
        this.qualityCodeDscr = qualityCodeDscr;
    }

    public String getBldbldgClassNum() {
        return bldbldgClassNum;
    }

    public void setBldbldgClassNum(String bldbldgClassNum) {
        this.bldbldgClassNum = bldbldgClassNum;
    }

    public String getBldgClassDscr() {
        return bldgClassDscr;
    }

    public void setBldgClassDscr(String bldgClassDscr) {
        this.bldgClassDscr = bldgClassDscr;
    }

    public String getConstCode() {
        return constCode;
    }

    public void setConstCode(String constCode) {
        this.constCode = constCode;
    }

    public String getConstCodeDscr() {
        return constCodeDscr;
    }

    public void setConstCodeDscr(String constCodeDscr) {
        this.constCodeDscr = constCodeDscr;
    }

    public Integer getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(Integer builtYear) {
        this.builtYear = builtYear;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public Integer getEffectiveYear() {
        return effectiveYear;
    }

    public void setEffectiveYear(Integer effectiveYear) {
        this.effectiveYear = effectiveYear;
    }

    public String getBsmtSF() {
        return bsmtSF;
    }

    public void setBsmtSF(String bsmtSF) {
        this.bsmtSF = bsmtSF;
    }

    public String getBsmtType() {
        return bsmtType;
    }

    public void setBsmtType(String bsmtType) {
        this.bsmtType = bsmtType;
    }

    public String getBsmtTypeDscr() {
        return bsmtTypeDscr;
    }

    public void setBsmtTypeDscr(String bsmtTypeDscr) {
        this.bsmtTypeDscr = bsmtTypeDscr;
    }

    public String getCarStorageSF() {
        return carStorageSF;
    }

    public void setCarStorageSF(String carStorageSF) {
        this.carStorageSF = carStorageSF;
    }

    public String getCarStorageType() {
        return carStorageType;
    }

    public void setCarStorageType(String carStorageType) {
        this.carStorageType = carStorageType;
    }

    public String getCarStorageTypeDscr() {
        return carStorageTypeDscr;
    }

    public void setCarStorageTypeDscr(String carStorageTypeDscr) {
        this.carStorageTypeDscr = carStorageTypeDscr;
    }

    public Float getNbrBedRoom() {
        return nbrBedRoom;
    }

    public void setNbrBedRoom(Float nbrBedRoom) {
        this.nbrBedRoom = nbrBedRoom;
    }

    public Float getNbrRoomsNobath() {
        return nbrRoomsNobath;
    }

    public void setNbrRoomsNobath(Float nbrRoomsNobath) {
        this.nbrRoomsNobath = nbrRoomsNobath;
    }

    public Float getMainfloorSF() {
        return mainfloorSF;
    }

    public void setMainfloorSF(Float mainfloorSF) {
        this.mainfloorSF = mainfloorSF;
    }

    public Float getNbrThreeQtrBaths() {
        return nbrThreeQtrBaths;
    }

    public void setNbrThreeQtrBaths(Float nbrThreeQtrBaths) {
        this.nbrThreeQtrBaths = nbrThreeQtrBaths;
    }

    public Float getNbrFullBaths() {
        return nbrFullBaths;
    }

    public void setNbrFullBaths(Float nbrFullBaths) {
        this.nbrFullBaths = nbrFullBaths;
    }

    public Float getNbrHalfBaths() {
        return nbrHalfBaths;
    }

    public void setNbrHalfBaths(Float nbrHalfBaths) {
        this.nbrHalfBaths = nbrHalfBaths;
    }

    public Float getTotalFinishedSF() {
        return totalFinishedSF;
    }

    public void setTotalFinishedSF(Float totalFinishedSF) {
        this.totalFinishedSF = totalFinishedSF;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getAcDscr() {
        return acDscr;
    }

    public void setAcDscr(String acDscr) {
        this.acDscr = acDscr;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public String getHeatingDscr() {
        return heatingDscr;
    }

    public void setHeatingDscr(String heatingDscr) {
        this.heatingDscr = heatingDscr;
    }

    public String getExtWallPrim() {
        return extWallPrim;
    }

    public void setExtWallPrim(String extWallPrim) {
        this.extWallPrim = extWallPrim;
    }

    public String getExtWallDscrPrim() {
        return extWallDscrPrim;
    }

    public void setExtWallDscrPrim(String extWallDscrPrim) {
        this.extWallDscrPrim = extWallDscrPrim;
    }

    public String getExtWallSec() {
        return extWallSec;
    }

    public void setExtWallSec(String extWallSec) {
        this.extWallSec = extWallSec;
    }

    public String getExtWallDscrSec() {
        return extWallDscrSec;
    }

    public void setExtWallDscrSec(String extWallDscrSec) {
        this.extWallDscrSec = extWallDscrSec;
    }

    public String getIntWall() {
        return intWall;
    }

    public void setIntWall(String intWall) {
        this.intWall = intWall;
    }

    public String getIntWallDscr() {
        return intWallDscr;
    }

    public void setIntWallDscr(String intWallDscr) {
        this.intWallDscr = intWallDscr;
    }

    public String getRoofCover() {
        return roofCover;
    }

    public void setRoofCover(String roofCover) {
        this.roofCover = roofCover;
    }

    public String getRoofCoverDscr() {
        return roofCoverDscr;
    }

    public void setRoofCoverDscr(String roofCoverDscr) {
        this.roofCoverDscr = roofCoverDscr;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(String unitCount) {
        this.unitCount = unitCount;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    @Override
    public String toString() {
        return "BuildingRecord{" +
                "strap='" + strap + '\'' +
                ", bldNum=" + bldNum +
                ", sectionNum=" + sectionNum +
                ", designCode='" + designCode + '\'' +
                ", designCodeDscr='" + designCodeDscr + '\'' +
                ", qualityCode='" + qualityCode + '\'' +
                ", qualityCodeDscr='" + qualityCodeDscr + '\'' +
                ", bldbldgClassNum='" + bldbldgClassNum + '\'' +
                ", bldgClassDscr='" + bldgClassDscr + '\'' +
                ", constCode='" + constCode + '\'' +
                ", constCodeDscr='" + constCodeDscr + '\'' +
                ", builtYear=" + builtYear +
                ", compCode='" + compCode + '\'' +
                ", effectiveYear=" + effectiveYear +
                ", bsmtSF='" + bsmtSF + '\'' +
                ", bsmtType='" + bsmtType + '\'' +
                ", bsmtTypeDscr='" + bsmtTypeDscr + '\'' +
                ", carStorageSF='" + carStorageSF + '\'' +
                ", carStorageType='" + carStorageType + '\'' +
                ", carStorageTypeDscr='" + carStorageTypeDscr + '\'' +
                ", nbrBedRoom=" + nbrBedRoom +
                ", nbrRoomsNobath=" + nbrRoomsNobath +
                ", mainfloorSF=" + mainfloorSF +
                ", nbrThreeQtrBaths=" + nbrThreeQtrBaths +
                ", nbrFullBaths=" + nbrFullBaths +
                ", nbrHalfBaths=" + nbrHalfBaths +
                ", totalFinishedSF=" + totalFinishedSF +
                ", ac='" + ac + '\'' +
                ", acDscr='" + acDscr + '\'' +
                ", heating='" + heating + '\'' +
                ", heatingDscr='" + heatingDscr + '\'' +
                ", extWallPrim='" + extWallPrim + '\'' +
                ", extWallDscrPrim='" + extWallDscrPrim + '\'' +
                ", extWallSec='" + extWallSec + '\'' +
                ", extWallDscrSec='" + extWallDscrSec + '\'' +
                ", intWall='" + intWall + '\'' +
                ", intWallDscr='" + intWallDscr + '\'' +
                ", roofCover='" + roofCover + '\'' +
                ", roofCoverDscr='" + roofCoverDscr + '\'' +
                ", stories='" + stories + '\'' +
                ", unitCount='" + unitCount + '\'' +
                ", statusCd='" + statusCd + '\'' +
                '}';
    }

}
