package com.hand.demo.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ApiModel("原料信息")
@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "raw_material")
public class RawMaterial extends AuditDomain {

    @Id
    @GeneratedValue
    @ApiModelProperty("id")
    private Long id;

    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    @NotNull(message = "error.rawMaterialCode.null")
    @ApiModelProperty("原料编码")
    private String rawMaterialCode;

    @NotNull(message = "error.rawMaterialName.null")
    @ApiModelProperty("原料名称")
    private String rawMaterialName;

    @ApiModelProperty("品牌")
    private String rawBrand;

    @ApiModelProperty("JDE品项编码")
    private String rawJdeCode;

    @ApiModelProperty("采购方式")
    private String rawPurchaseType;

    @ApiModelProperty("单位")
    private String rawUnit;

    @ApiModelProperty("QA")
    private String aupplyQa;

    @ApiModelProperty("eqa编码")
    private String eqaCode;

    @ApiModelProperty("签署特殊版本笑TDA")
    private String signedVersionTda;

    @ApiModelProperty("是否含水")
    private String containingWater;

    @ApiModelProperty("原料状态")
    private String rawMaterialState;

    @ApiModelProperty("申请单状态")
    private String applicationFormState;

    @ApiModelProperty("JDE品项名称")
    private String jdeProductItemName;

    @ApiModelProperty("创建日期从")
    private Date createDateStart;

    @ApiModelProperty("创建日期至")
    private Date createDateEnd;

    @NotNull(message = "error.comboId.null")
    @ApiModelProperty("套餐id")
    private Long comboId;

    @NotNull(message = "error.menuId.null")
    @ApiModelProperty("菜单id")
    private Long menuId;

    public String getRawMaterialCode() {
        return rawMaterialCode;
    }

    public void setRawMaterialCode(String rawMaterialCode) {
        this.rawMaterialCode = rawMaterialCode;
    }

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public void setRawMaterialName(String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
    }

    public String getRawBrand() {
        return rawBrand;
    }

    public void setRawBrand(String rawBrand) {
        this.rawBrand = rawBrand;
    }

    public String getRawJdeCode() {
        return rawJdeCode;
    }

    public void setRawJdeCode(String rawJdeCode) {
        this.rawJdeCode = rawJdeCode;
    }

    public String getRawPurchaseType() {
        return rawPurchaseType;
    }

    public void setRawPurchaseType(String rawPurchaseType) {
        this.rawPurchaseType = rawPurchaseType;
    }

    public String getRawUnit() {
        return rawUnit;
    }

    public void setRawUnit(String rawUnit) {
        this.rawUnit = rawUnit;
    }

    public String getAupplyQa() {
        return aupplyQa;
    }

    public void setAupplyQa(String aupplyQa) {
        this.aupplyQa = aupplyQa;
    }

    public String getEqaCode() {
        return eqaCode;
    }

    public void setEqaCode(String eqaCode) {
        this.eqaCode = eqaCode;
    }

    public String getSignedVersionTda() {
        return signedVersionTda;
    }

    public void setSignedVersionTda(String signedVersionTda) {
        this.signedVersionTda = signedVersionTda;
    }

    public String getContainingWater() {
        return containingWater;
    }

    public void setContainingWater(String containingWater) {
        this.containingWater = containingWater;
    }

    public String getRawMaterialState() {
        return rawMaterialState;
    }

    public void setRawMaterialState(String rawMaterialState) {
        this.rawMaterialState = rawMaterialState;
    }

    public String getApplicationFormState() {
        return applicationFormState;
    }

    public void setApplicationFormState(String applicationFormState) {
        this.applicationFormState = applicationFormState;
    }

    public String getJdeProductItemName() {
        return jdeProductItemName;
    }

    public void setJdeProductItemName(String jdeProductItemName) {
        this.jdeProductItemName = jdeProductItemName;
    }

    public Date getCreateDateStart() {
        return createDateStart;
    }

    public void setCreateDateStart(Date createDateStart) {
        this.createDateStart = createDateStart;
    }

    public Date getCreateDateEnd() {
        return createDateEnd;
    }

    public void setCreateDateEnd(Date createDateEnd) {
        this.createDateEnd = createDateEnd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getComboId() {
        return comboId;
    }

    public void setComboId(Long comboId) {
        this.comboId = comboId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RawMaterial other = (RawMaterial) that;
        return (this.getRawMaterialCode() == null ? other.getRawMaterialCode() == null : this.getRawMaterialCode().equals(other.getRawMaterialCode()))
                && (this.getRawMaterialName() == null ? other.getRawMaterialName() == null : this.getRawMaterialName().equals(other.getRawMaterialName()))
                && (this.getRawBrand() == null ? other.getRawBrand() == null : this.getRawBrand().equals(other.getRawBrand()))
                && (this.getRawJdeCode() == null ? other.getRawJdeCode() == null : this.getRawJdeCode().equals(other.getRawJdeCode()))
                && (this.getRawPurchaseType() == null ? other.getRawPurchaseType() == null : this.getRawPurchaseType().equals(other.getRawPurchaseType()))
                && (this.getRawUnit() == null ? other.getRawUnit() == null : this.getRawUnit().equals(other.getRawUnit()))
                && (this.getAupplyQa() == null ? other.getAupplyQa() == null : this.getAupplyQa().equals(other.getAupplyQa()))
                && (this.getEqaCode() == null ? other.getEqaCode() == null : this.getEqaCode().equals(other.getEqaCode()))
                && (this.getSignedVersionTda() == null ? other.getSignedVersionTda() == null : this.getSignedVersionTda().equals(other.getSignedVersionTda()))
                && (this.getContainingWater() == null ? other.getContainingWater() == null : this.getContainingWater().equals(other.getContainingWater()))
                && (this.getRawMaterialState() == null ? other.getRawMaterialState() == null : this.getRawMaterialState().equals(other.getRawMaterialState()))
                && (this.getApplicationFormState() == null ? other.getApplicationFormState() == null : this.getApplicationFormState().equals(other.getApplicationFormState()))
                && (this.getJdeProductItemName() == null ? other.getJdeProductItemName() == null : this.getJdeProductItemName().equals(other.getJdeProductItemName()))
                && (this.getCreateDateStart() == null ? other.getCreateDateStart() == null : this.getCreateDateStart().equals(other.getCreateDateStart()))
                && (this.getCreateDateEnd() == null ? other.getCreateDateEnd() == null : this.getCreateDateEnd().equals(other.getCreateDateEnd()))
                && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getComboId() == null ? other.getComboId() == null : this.getComboId().equals(other.getComboId()))
                && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRawMaterialCode() == null) ? 0 : getRawMaterialCode().hashCode());
        result = prime * result + ((getRawMaterialName() == null) ? 0 : getRawMaterialName().hashCode());
        result = prime * result + ((getRawBrand() == null) ? 0 : getRawBrand().hashCode());
        result = prime * result + ((getRawJdeCode() == null) ? 0 : getRawJdeCode().hashCode());
        result = prime * result + ((getRawPurchaseType() == null) ? 0 : getRawPurchaseType().hashCode());
        result = prime * result + ((getRawUnit() == null) ? 0 : getRawUnit().hashCode());
        result = prime * result + ((getAupplyQa() == null) ? 0 : getAupplyQa().hashCode());
        result = prime * result + ((getEqaCode() == null) ? 0 : getEqaCode().hashCode());
        result = prime * result + ((getSignedVersionTda() == null) ? 0 : getSignedVersionTda().hashCode());
        result = prime * result + ((getContainingWater() == null) ? 0 : getContainingWater().hashCode());
        result = prime * result + ((getRawMaterialState() == null) ? 0 : getRawMaterialState().hashCode());
        result = prime * result + ((getApplicationFormState() == null) ? 0 : getApplicationFormState().hashCode());
        result = prime * result + ((getJdeProductItemName() == null) ? 0 : getJdeProductItemName().hashCode());
        result = prime * result + ((getCreateDateStart() == null) ? 0 : getCreateDateStart().hashCode());
        result = prime * result + ((getCreateDateEnd() == null) ? 0 : getCreateDateEnd().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComboId() == null) ? 0 : getComboId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rawMaterialCode=").append(rawMaterialCode);
        sb.append(", rawMaterialName=").append(rawMaterialName);
        sb.append(", rawBrand=").append(rawBrand);
        sb.append(", rawJdeCode=").append(rawJdeCode);
        sb.append(", rawPurchaseType=").append(rawPurchaseType);
        sb.append(", rawUnit=").append(rawUnit);
        sb.append(", aupplyQa=").append(aupplyQa);
        sb.append(", eqaCode=").append(eqaCode);
        sb.append(", signedVersionTda=").append(signedVersionTda);
        sb.append(", containingWater=").append(containingWater);
        sb.append(", rawMaterialState=").append(rawMaterialState);
        sb.append(", applicationFormState=").append(applicationFormState);
        sb.append(", jdeProductItemName=").append(jdeProductItemName);
        sb.append(", createDateStart=").append(createDateStart);
        sb.append(", createDateEnd=").append(createDateEnd);
        sb.append(", id=").append(id);
        sb.append(", comboId=").append(comboId);
        sb.append(", menuId=").append(menuId);
        sb.append("]");
        return sb.toString();
    }
}