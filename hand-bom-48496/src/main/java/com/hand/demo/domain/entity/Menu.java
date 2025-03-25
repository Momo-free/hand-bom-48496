package com.hand.demo.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "menu")
public class Menu extends AuditDomain {

    /**
     * id
     */
    @Id
    @GeneratedValue
    @ApiModelProperty("id")
    private Long id;

    /**
     * 租户ID
     */
    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    /**
     * 菜单描述
     */
    @NotNull(message = "error.menuDescription.null")
    @ApiModelProperty("菜单描述")
    private String menuDescription;

    /**
     * 品牌
     */
    @NotNull(message = "error.brand.null")
    @ApiModelProperty("品牌")
    private String brand;

    /**
     * 菜单名称
     */
    @NotNull(message = "error.menuName.null")
    @ApiModelProperty("菜单名称")
    private String menuName;

    /**
     * 菜单编码
     */
    @NotNull(message = "error.menuCode.null")
    @ApiModelProperty("菜单编码")
    private String menuCode;

    /**
     * 负责人
     */
    @NotNull(message = "error.menuOwner.null")
    @ApiModelProperty("负责人")
    private String menuOwner;

    /**
     * menu的生效日期
     */
    @NotNull(message = "error.menuStartDate.null")
    @ApiModelProperty("菜单生效日期")
    private Date menuStartDate;

    /**
     * menu的失效日期
     */
    @NotNull(message = "error.menuEndDate.null")
    @ApiModelProperty("菜单失效日期")
    private Date menuEndDate;

    /**
     * 备注
     */
    private String remark;


    /**
     * 菜单描述
     */
    public String getMenuDescription() {
        return menuDescription;
    }

    /**
     * 菜单描述
     */
    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    /**
     * 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 菜单编码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 菜单编码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * 负责人
     */
    public String getMenuOwner() {
        return menuOwner;
    }

    /**
     * 负责人
     */
    public void setMenuOwner(String menuOwner) {
        this.menuOwner = menuOwner;
    }

    /**
     * menu的生效日期
     */
    public Date getMenuStartDate() {
        return menuStartDate;
    }

    /**
     * menu的生效日期
     */
    public void setMenuStartDate(Date menuStartDate) {
        this.menuStartDate = menuStartDate;
    }

    /**
     * menu的失效日期
     */
    public Date getMenuEndDate() {
        return menuEndDate;
    }

    /**
     * menu的失效日期
     */
    public void setMenuEndDate(Date menuEndDate) {
        this.menuEndDate = menuEndDate;
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
