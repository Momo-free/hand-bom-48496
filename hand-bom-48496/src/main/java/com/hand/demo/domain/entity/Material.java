package com.hand.demo.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "material")
public class Material extends AuditDomain {

    public static final String FIELD_ID = "id";
    public static final String FIELD_MATERIAL_CODE = "materialCode";
    public static final String FIELD_MATERIAL_NAME = "materialName";

    @Id
    @GeneratedValue
    private Long id;

    private String materialCode;

    private String materialName;

    @NotNull
    private String brand;

    private String jdeCode;

    @NotNull
    private String purchaseType;

    @NotNull
    private String unit;

    private String supplyQa;

    private String eqaCode;

    @NotNull
    private String specialTda;

    @NotNull
    private String containsWater;

    @NotNull
    private String materialStatus;

    @NotNull
    private String applyStatus;

    private String jdeName;

    private String specUrl;

    private String remark;

    @NotNull
    private Long tenantId;

    // getter and setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSpecUrl() {
        return specUrl;
    }

    public void setSpecUrl(String specUrl) {
        this.specUrl = specUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}