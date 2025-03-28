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

    @NotNull(message = "error.comboType.null")
    @ApiModelProperty("套餐描述")
    private String comboDescription;


    @ApiModelProperty("套餐名称")
    private String comboName;


    @ApiModelProperty("套餐编码")
    private String comboCode;


    @ApiModelProperty("套餐类型，LTO/Permanent")
    private String comboType;

    @NotNull(message = "error.salesArea.null")
    @ApiModelProperty("销售地区")
    private String salesArea;


    @NotNull
    private String brand;

    @NotNull(message = "error.comboStartDate.null")
    @ApiModelProperty("有效起始日期")
    private Date comboStartDate;

    @NotNull(message = "error.comboEndDate.null")
    @ApiModelProperty("有效终止时间")
    private Date comboEndDate;

    @NotNull
    private Long menuId;

    @ApiModelProperty("负责人")
    private String comboOwner;

    @ApiModelProperty("备注")
    private String remark;

    private String comboStatus;




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

}