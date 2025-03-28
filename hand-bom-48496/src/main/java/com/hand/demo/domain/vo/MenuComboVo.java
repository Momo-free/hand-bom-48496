package com.hand.demo.domain.vo;

import java.util.Date;

/**
 * 菜单套餐查询结果VO
 */
public class MenuComboVo {
    private Long menuId;
    private String menuName;        // 菜单名称
    private String menuCode;        // 菜单编码
    private String comboName;       // 套餐名称
    private String comboCode;       // 套餐编码
    private long tenant_id;

    public long getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(long tenant_id) {
        this.tenant_id = tenant_id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    private String salesArea;       // 销售区域
    private Date startDate;         // 开始日期
    private Date endDate;          // 结束日期
    private String comboType;      // 套餐类型
    private String menuOwner;      // 菜单负责人
    private String comboOwner;     // 套餐负责人

    // Getters and Setters
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

    public String getSalesArea() {
        return salesArea;
    }

    public void setSalesArea(String salesArea) {
        this.salesArea = salesArea;
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

    public String getComboType() {
        return comboType;
    }

    public void setComboType(String comboType) {
        this.comboType = comboType;
    }

    public String getMenuOwner() {
        return menuOwner;
    }

    public void setMenuOwner(String menuOwner) {
        this.menuOwner = menuOwner;
    }

    public String getComboOwner() {
        return comboOwner;
    }

    public void setComboOwner(String comboOwner) {
        this.comboOwner = comboOwner;
    }
}
