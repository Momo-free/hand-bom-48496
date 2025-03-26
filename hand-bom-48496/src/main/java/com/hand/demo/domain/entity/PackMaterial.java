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

@ApiModel("包材信息")
@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "pack_material")
public class PackMaterial extends AuditDomain {

    @Id
    @GeneratedValue
    @ApiModelProperty("id")
    private Long id;

    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    @NotNull(message = "error.packMaterialCode.null")
    @ApiModelProperty("包材编码")
    private String packMaterialCode;

    @NotNull(message = "error.packMaterialName.null")
    @ApiModelProperty("包材名称")
    private String packMaterialName;

    @ApiModelProperty("包材规格")
    private String specifications;

    @ApiModelProperty("型号")
    private String model;

    @ApiModelProperty("食品种类")
    private String foodType;

    @ApiModelProperty("材质")
    private String materialQuality;

    @ApiModelProperty("采购方式")
    private String purchaseType;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("supply QA")
    private String supplyQa;

    @ApiModelProperty("签署特殊版本TDA")
    private String signSpecialVersionTda;

    @ApiModelProperty("SPEC链接")
    private String spec;

    @ApiModelProperty("备注")
    private String remark;

    @NotNull(message = "error.comboId.null")
    @ApiModelProperty("套餐id")
    private Long comboId;

    @NotNull(message = "error.menuId.null")
    @ApiModelProperty("菜单id")
    private Long menuId;

    public String getPackMaterialCode() {
        return packMaterialCode;
    }

    public void setPackMaterialCode(String packMaterialCode) {
        this.packMaterialCode = packMaterialCode;
    }

    public String getPackMaterialName() {
        return packMaterialName;
    }

    public void setPackMaterialName(String packMaterialName) {
        this.packMaterialName = packMaterialName;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
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

    public String getSignSpecialVersionTda() {
        return signSpecialVersionTda;
    }

    public void setSignSpecialVersionTda(String signSpecialVersionTda) {
        this.signSpecialVersionTda = signSpecialVersionTda;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        PackMaterial other = (PackMaterial) that;
        return (this.getPackMaterialCode() == null ? other.getPackMaterialCode() == null : this.getPackMaterialCode().equals(other.getPackMaterialCode()))
                && (this.getPackMaterialName() == null ? other.getPackMaterialName() == null : this.getPackMaterialName().equals(other.getPackMaterialName()))
                && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
                && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
                && (this.getFoodType() == null ? other.getFoodType() == null : this.getFoodType().equals(other.getFoodType()))
                && (this.getMaterialQuality() == null ? other.getMaterialQuality() == null : this.getMaterialQuality().equals(other.getMaterialQuality()))
                && (this.getPurchaseType() == null ? other.getPurchaseType() == null : this.getPurchaseType().equals(other.getPurchaseType()))
                && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
                && (this.getSupplyQa() == null ? other.getSupplyQa() == null : this.getSupplyQa().equals(other.getSupplyQa()))
                && (this.getSignSpecialVersionTda() == null ? other.getSignSpecialVersionTda() == null : this.getSignSpecialVersionTda().equals(other.getSignSpecialVersionTda()))
                && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getComboId() == null ? other.getComboId() == null : this.getComboId().equals(other.getComboId()))
                && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPackMaterialCode() == null) ? 0 : getPackMaterialCode().hashCode());
        result = prime * result + ((getPackMaterialName() == null) ? 0 : getPackMaterialName().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getFoodType() == null) ? 0 : getFoodType().hashCode());
        result = prime * result + ((getMaterialQuality() == null) ? 0 : getMaterialQuality().hashCode());
        result = prime * result + ((getPurchaseType() == null) ? 0 : getPurchaseType().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getSupplyQa() == null) ? 0 : getSupplyQa().hashCode());
        result = prime * result + ((getSignSpecialVersionTda() == null) ? 0 : getSignSpecialVersionTda().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", packMaterialCode=").append(packMaterialCode);
        sb.append(", packMaterialName=").append(packMaterialName);
        sb.append(", specifications=").append(specifications);
        sb.append(", model=").append(model);
        sb.append(", foodType=").append(foodType);
        sb.append(", materialQuality=").append(materialQuality);
        sb.append(", purchaseType=").append(purchaseType);
        sb.append(", unit=").append(unit);
        sb.append(", supplyQa=").append(supplyQa);
        sb.append(", signSpecialVersionTda=").append(signSpecialVersionTda);
        sb.append(", spec=").append(spec);
        sb.append(", remark=").append(remark);
        sb.append(", id=").append(id);
        sb.append(", comboId=").append(comboId);
        sb.append(", menuId=").append(menuId);
        sb.append("]");
        return sb.toString();
    }
}