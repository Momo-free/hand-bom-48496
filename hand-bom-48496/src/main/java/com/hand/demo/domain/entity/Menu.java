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

@ApiModel("用户信息")
@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "menu")
public class Menu extends AuditDomain {

    @Id
    @GeneratedValue
    @ApiModelProperty("id")
    private Long id;

    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    @NotNull(message = "error.menuDescription.null")
    @ApiModelProperty("菜单描述")
    private String menuDescription;

    @NotNull(message = "error.brand.null")
    @ApiModelProperty("品牌")
    private String brand;

    @NotNull(message = "error.menuName.null")
    @ApiModelProperty("菜单名称")
    private String menuName;

    @NotNull(message = "error.menuCode.null")
    @ApiModelProperty("菜单编码")
    private String menuCode;

    @NotNull(message = "error.menuOwner.null")
    @ApiModelProperty("负责人")
    private String menuOwner;

    @NotNull(message = "error.menuStartDate.null")
    @ApiModelProperty("菜单生效日期")
    private Date menuStartDate;

    @NotNull(message = "error.menuEndDate.null")
    @ApiModelProperty("菜单失效日期")
    private Date menuEndDate;

    private String remark;

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuOwner() {
        return menuOwner;
    }

    public void setMenuOwner(String menuOwner) {
        this.menuOwner = menuOwner;
    }

    public Date getMenuStartDate() {
        return menuStartDate;
    }

    public void setMenuStartDate(Date menuStartDate) {
        this.menuStartDate = menuStartDate;
    }

    public Date getMenuEndDate() {
        return menuEndDate;
    }

    public void setMenuEndDate(Date menuEndDate) {
        this.menuEndDate = menuEndDate;
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
        Menu other = (Menu) that;
        return (this.getMenuDescription() == null ? other.getMenuDescription() == null : this.getMenuDescription().equals(other.getMenuDescription()))
                && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
                && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
                && (this.getMenuCode() == null ? other.getMenuCode() == null : this.getMenuCode().equals(other.getMenuCode()))
                && (this.getMenuOwner() == null ? other.getMenuOwner() == null : this.getMenuOwner().equals(other.getMenuOwner()))
                && (this.getMenuStartDate() == null ? other.getMenuStartDate() == null : this.getMenuStartDate().equals(other.getMenuStartDate()))
                && (this.getMenuEndDate() == null ? other.getMenuEndDate() == null : this.getMenuEndDate().equals(other.getMenuEndDate()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuDescription() == null) ? 0 : getMenuDescription().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuCode() == null) ? 0 : getMenuCode().hashCode());
        result = prime * result + ((getMenuOwner() == null) ? 0 : getMenuOwner().hashCode());
        result = prime * result + ((getMenuStartDate() == null) ? 0 : getMenuStartDate().hashCode());
        result = prime * result + ((getMenuEndDate() == null) ? 0 : getMenuEndDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuDescription=").append(menuDescription);
        sb.append(", brand=").append(brand);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuCode=").append(menuCode);
        sb.append(", menuOwner=").append(menuOwner);
        sb.append(", menuStartDate=").append(menuStartDate);
        sb.append(", menuEndDate=").append(menuEndDate);
        sb.append(", remark=").append(remark);
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}