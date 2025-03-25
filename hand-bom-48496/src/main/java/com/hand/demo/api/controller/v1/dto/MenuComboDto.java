package com.hand.demo.api.controller.v1.dto;

import java.util.Date;

public class MenuComboDto {
    private String menuName;
    private String menuCode;
    private String menuOwner;
    private String comboName;
    private String comboCode;
    private String comboType;
    private String salesArea;
    private Date comboStartDate;
    private Date comboEndDate;
    private Date lastUpdateDate;
    private String comboOwner;
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