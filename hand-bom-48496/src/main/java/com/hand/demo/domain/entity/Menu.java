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
    private Integer id;

    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    @NotNull(message = "error.menuDescription.null")
    @ApiModelProperty("菜单描述")
    private String menuDescription;

    @NotNull(message = "error.brand.null")
    @ApiModelProperty("品牌")
    private String brand;


    @ApiModelProperty("菜单名称")
    private String menuName;


    @ApiModelProperty("菜单编码")
    private String menuCode;


    @ApiModelProperty("负责人")
    private String menuOwner;


    @ApiModelProperty("菜单生效日期")
    private Date menuStartDate;


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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = (id);
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

}