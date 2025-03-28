package com.hand.demo.api.controller.v1.dto;

import java.util.Date;

/**
 * 菜单套餐查询条件DTO
 */
public class MenuComboDto {
    private String menuName;
    private String menuOwner;
    private Date startDate;
    private Date endDate;
    private String comboName;
    private String comboOwner;
    private String comboType;
    private String salesArea;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuOwner() {
        return menuOwner;
    }

    public void setMenuOwner(String menuOwner) {
        this.menuOwner = menuOwner;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public String getComboOwner() {
        return comboOwner;
    }

    public void setComboOwner(String comboOwner) {
        this.comboOwner = comboOwner;
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
}
