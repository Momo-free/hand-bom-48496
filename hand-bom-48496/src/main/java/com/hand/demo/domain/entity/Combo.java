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

@ApiModel("套餐信息")
@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "combo")
public class Combo extends AuditDomain {

    @Id
    @GeneratedValue
    @ApiModelProperty("id")
    private Long id;

    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    @NotNull(message = "error.comboDescription.null")
    @ApiModelProperty("套餐描述")
    private String comboDescription;

    @NotNull(message = "error.comboName.null")
    @ApiModelProperty("套餐名称")
    private String comboName;

    @NotNull(message = "error.comboCode.null")
    @ApiModelProperty("套餐编码")
    private String comboCode;

    @NotNull(message = "error.comboType.null")
    @ApiModelProperty("套餐类型，LTO/Permanent")
    private String comboType;

    @NotNull(message = "error.salesArea.null")
    @ApiModelProperty("销售地区")
    private String salesArea;

    @NotNull(message = "error.comboStartDate.null")
    @ApiModelProperty("有效起始日期")
    private Date comboStartDate;

    @NotNull(message = "error.comboEndDate.null")
    @ApiModelProperty("有效终止时间")
    private Date comboEndDate;

    @NotNull(message = "error.comboOwner.null")
    @ApiModelProperty("负责人")
    private String comboOwner;

    @ApiModelProperty("备注")
    private String remark;

    @NotNull(message = "error.comboStatus.null")
    @ApiModelProperty("状态")
    private String comboStatus;

    @NotNull(message = "error.menuId.null")
    @ApiModelProperty("套餐id")
    private Long menuId;

    public String getComboDescription() {
        return comboDescription;
    }

    public void setComboDescription(String comboDescription) {
        this.comboDescription = comboDescription;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public String getComboCode() {
        return comboCode;
    }

    public void setComboCode(String comboCode) {
        this.comboCode = comboCode;
    }

    public String getComboType() {
        return comboType;
    }

    public void setComboType(String comboType) {
        this.comboType = comboType;
    }

    public String getSalesArea() {
        return salesArea;
    }

    public void setSalesArea(String salesArea) {
        this.salesArea = salesArea;
    }

    public Date getComboStartDate() {
        return comboStartDate;
    }

    public void setComboStartDate(Date comboStartDate) {
        this.comboStartDate = comboStartDate;
    }

    public Date getComboEndDate() {
        return comboEndDate;
    }

    public void setComboEndDate(Date comboEndDate) {
        this.comboEndDate = comboEndDate;
    }

    public String getComboOwner() {
        return comboOwner;
    }

    public void setComboOwner(String comboOwner) {
        this.comboOwner = comboOwner;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getComboStatus() {
        return comboStatus;
    }

    public void setComboStatus(String comboStatus) {
        this.comboStatus = comboStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        Combo other = (Combo) that;
        return (this.getComboDescription() == null ? other.getComboDescription() == null : this.getComboDescription().equals(other.getComboDescription()))
                && (this.getComboName() == null ? other.getComboName() == null : this.getComboName().equals(other.getComboName()))
                && (this.getComboCode() == null ? other.getComboCode() == null : this.getComboCode().equals(other.getComboCode()))
                && (this.getComboType() == null ? other.getComboType() == null : this.getComboType().equals(other.getComboType()))
                && (this.getSalesArea() == null ? other.getSalesArea() == null : this.getSalesArea().equals(other.getSalesArea()))
                && (this.getComboStartDate() == null ? other.getComboStartDate() == null : this.getComboStartDate().equals(other.getComboStartDate()))
                && (this.getComboEndDate() == null ? other.getComboEndDate() == null : this.getComboEndDate().equals(other.getComboEndDate()))
                && (this.getComboOwner() == null ? other.getComboOwner() == null : this.getComboOwner().equals(other.getComboOwner()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getComboStatus() == null ? other.getComboStatus() == null : this.getComboStatus().equals(other.getComboStatus()))
                && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComboDescription() == null) ? 0 : getComboDescription().hashCode());
        result = prime * result + ((getComboName() == null) ? 0 : getComboName().hashCode());
        result = prime * result + ((getComboCode() == null) ? 0 : getComboCode().hashCode());
        result = prime * result + ((getComboType() == null) ? 0 : getComboType().hashCode());
        result = prime * result + ((getSalesArea() == null) ? 0 : getSalesArea().hashCode());
        result = prime * result + ((getComboStartDate() == null) ? 0 : getComboStartDate().hashCode());
        result = prime * result + ((getComboEndDate() == null) ? 0 : getComboEndDate().hashCode());
        result = prime * result + ((getComboOwner() == null) ? 0 : getComboOwner().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getComboStatus() == null) ? 0 : getComboStatus().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", comboDescription=").append(comboDescription);
        sb.append(", comboName=").append(comboName);
        sb.append(", comboCode=").append(comboCode);
        sb.append(", comboType=").append(comboType);
        sb.append(", salesArea=").append(salesArea);
        sb.append(", comboStartDate=").append(comboStartDate);
        sb.append(", comboEndDate=").append(comboEndDate);
        sb.append(", comboOwner=").append(comboOwner);
        sb.append(", remark=").append(remark);
        sb.append(", comboStatus=").append(comboStatus);
        sb.append(", id=").append(id);
        sb.append(", menuId=").append(menuId);
        sb.append("]");
        return sb.toString();
    }
}