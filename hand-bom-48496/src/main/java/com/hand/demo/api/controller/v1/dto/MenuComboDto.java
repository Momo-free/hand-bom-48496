package com.hand.demo.api.controller.v1.dto;

import java.util.Date;

public class MenuComboDto {
    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单负责人
     */
    private String menuOwner;

    /**
     * 套餐名称
     */
    private String comboName;

    /**
     * 套餐编码
     */
    private String comboCode;


    /**
     * 套餐类型
     */
    private String comboType;

    /**
     * 销售地区
     */
    private String salesArea;

    /**
     * 有效起始日期
     */
    private Date comboStartDate;

    /**
     * 有效终止时间
     */
    private Date comboEndDate;

    /**
     * 最后更新时间
     */
    private Date lastUpdateDate;

    /**
     * 套餐负责人
     */
    private String comboOwner;

    /**
     * 租户ID
     */
    private Long tenantId;

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

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getComboOwner() {
        return comboOwner;
    }

    public void setComboOwner(String comboOwner) {
        this.comboOwner = comboOwner;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

}
