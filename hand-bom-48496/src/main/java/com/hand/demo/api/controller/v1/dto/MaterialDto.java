package com.hand.demo.api.controller.v1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class MaterialDto {
    
    @ApiModelProperty("原料编码")
    private String materialCode;
    
    @ApiModelProperty("原料名称")
    private String materialName;
    
    @ApiModelProperty("品牌")
    private String brand;
    
    @ApiModelProperty("JDE品项编码")
    private String jdeCode;
    
    @ApiModelProperty("采购方式")
    private String purchaseType;
    
    @ApiModelProperty("单位")
    private String unit;
    
    @ApiModelProperty("Supply QA")
    private String supplyQa;
    
    @ApiModelProperty("EQA编码")
    private String eqaCode;
    
    @ApiModelProperty("签署特殊版本小TDA")
    private String specialTda;
    
    @ApiModelProperty("是否含水")
    private String containsWater;
    
    @ApiModelProperty("原料状态")
    private String materialStatus;
    
    @ApiModelProperty("申请单状态")
    private String applyStatus;
    
    @ApiModelProperty("JDE品项名称")
    private String jdeName;
    
    @ApiModelProperty("创建人")
    private String createdBy;
    
    @ApiModelProperty("创建日期从")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationDateFrom;
    
    @ApiModelProperty("创建日期至")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationDateTo;

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getJdeCode() {
        return jdeCode;
    }

    public void setJdeCode(String jdeCode) {
        this.jdeCode = jdeCode;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSupplyQa() {
        return supplyQa;
    }

    public void setSupplyQa(String supplyQa) {
        this.supplyQa = supplyQa;
    }

    public String getEqaCode() {
        return eqaCode;
    }

    public void setEqaCode(String eqaCode) {
        this.eqaCode = eqaCode;
    }

    public String getSpecialTda() {
        return specialTda;
    }

    public void setSpecialTda(String specialTda) {
        this.specialTda = specialTda;
    }

    public String getContainsWater() {
        return containsWater;
    }

    public void setContainsWater(String containsWater) {
        this.containsWater = containsWater;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getJdeName() {
        return jdeName;
    }

    public void setJdeName(String jdeName) {
        this.jdeName = jdeName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDateFrom() {
        return creationDateFrom;
    }

    public void setCreationDateFrom(Date creationDateFrom) {
        this.creationDateFrom = creationDateFrom;
    }

    public Date getCreationDateTo() {
        return creationDateTo;
    }

    public void setCreationDateTo(Date creationDateTo) {
        this.creationDateTo = creationDateTo;
    }
}
