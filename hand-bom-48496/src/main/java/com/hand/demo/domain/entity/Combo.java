package com.hand.demo.domain.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.swagger.annotations.ApiModelProperty;
import org.hzero.core.util.Regexs;

import java.util.Date;

/**
 * 实体
 */
@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "combo")
public class Combo extends AuditDomain {

    /**
     * id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 租户ID
     */
    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    /**
     * 套餐描述
     */
    private String comboDescription;

    /**
     * 套餐名称
     */
    @NotNull(message = "error.comboName.null")
    private String comboName;

    /**
     * 套餐编码
     */
    @NotNull(message = "error.comboCode.null")
    private String comboCode;


    /**
     * 套餐类型，LTO/Permanent
     */
    @NotNull(message = "error.comboType.null")
    private String comboType;

    /**
     * 销售地区
     */
    @NotNull(message = "error.salesArea.null")
    private String salesArea;

    /**
     * 有效起始日期
     */
    @NotNull(message = "error.comboStartDate.null")
    private Date comboStartDate;

    /**
     * 有效终止时间
     */
    @NotNull(message = "error.comboEndDate.null")
    private Date comboEndDate;

    /**
     * 负责人
     */
    @NotNull(message = "error.comboOwner.null")
    private String comboOwner;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    @NotNull(message = "error.comboStatus.null")
    private String comboStatus;


    /**
     * 套餐id
     */
    @NotNull(message = "error.menuId.null")
    private Long menuId;

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * 套餐描述
     */
    public String getComboDescription() {
        return comboDescription;
    }

    /**
     * 套餐描述
     */
    public void setComboDescription(String comboDescription) {
        this.comboDescription = comboDescription;
    }

    /**
     * 套餐名称
     */
    public String getComboName() {
        return comboName;
    }

    /**
     * 套餐名称
     */
    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    /**
     * 套餐编码
     */
    public String getComboCode() {
        return comboCode;
    }

    /**
     * 套餐编码
     */
    public void setComboCode(String comboCode) {
        this.comboCode = comboCode;
    }

    /**
     * 套餐类型，LTO/Permanent
     */
    public String getComboType() {
        return comboType;
    }

    /**
     * 套餐类型，LTO/Permanent
     */
    public void setComboType(String comboType) {
        this.comboType = comboType;
    }

    /**
     * 销售地区
     */
    public String getSalesArea() {
        return salesArea;
    }

    /**
     * 销售地区
     */
    public void setSalesArea(String salesArea) {
        this.salesArea = salesArea;
    }

    /**
     * 有效起始日期
     */
    public Date getComboStartDate() {
        return comboStartDate;
    }

    /**
     * 有效起始日期
     */
    public void setComboStartDate(Date comboStartDate) {
        this.comboStartDate = comboStartDate;
    }

    /**
     * 有效终止时间
     */
    public Date getComboEndDate() {
        return comboEndDate;
    }

    /**
     * 有效终止时间
     */
    public void setComboEndDate(Date comboEndDate) {
        this.comboEndDate = comboEndDate;
    }


    /**
     * 负责人
     */
    public String getComboOwner() {
        return comboOwner;
    }

    /**
     * 负责人
     */
    public void setComboOwner(String comboOwner) {
        this.comboOwner = comboOwner;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 状态
     */
    public String getComboStatus() {
        return comboStatus;
    }

    /**
     * 状态
     */
    public void setComboStatus(String comboStatus) {
        this.comboStatus = comboStatus;
    }

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 套餐id
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 套餐id
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
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
                && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
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
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
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
