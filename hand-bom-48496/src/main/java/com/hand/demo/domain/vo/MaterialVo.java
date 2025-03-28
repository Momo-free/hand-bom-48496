package com.hand.demo.domain.vo;


import io.swagger.annotations.ApiModelProperty;

public class MaterialVo {
    
    @ApiModelProperty("序号")
    private Integer serialNumber;
    
    @ApiModelProperty("原料编码")
    private String materialCode;
    
    @ApiModelProperty("原料名称")
    private String materialName;
    
    @ApiModelProperty("有效品牌")
    private String brand;
    
    @ApiModelProperty("采购方式")
    private String purchaseType;
    
    @ApiModelProperty("单位")
    private String unit;
    
    @ApiModelProperty("SPEC链接")
    private String specUrl;
    
    @ApiModelProperty("EQA编码")
    private String eqaCode;
    
    @ApiModelProperty("签署特殊版本小TDA")
    private String specialTda;
    
    @ApiModelProperty("是否含水")
    private String containsWater;
    
    @ApiModelProperty("原料状态")
    private String materialStatus;
    
    @ApiModelProperty("Supply QA")
    private String supplyQa;
    
    @ApiModelProperty("申请单状态")
    private String applyStatus;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

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

    public String getSpecUrl() {
        return specUrl;
    }

    public void setSpecUrl(String specUrl) {
        this.specUrl = specUrl;
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

    public String getSupplyQa() {
        return supplyQa;
    }

    public void setSupplyQa(String supplyQa) {
        this.supplyQa = supplyQa;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }
}