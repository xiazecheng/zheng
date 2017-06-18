package com.zheng.shop.dao.model;

import java.io.Serializable;

public class ShopProductAttribute implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Long ctime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Long mtime;

    private String attributeOptionStore;

    /**
     * 属性类型
     *
     * @mbg.generated
     */
    private Integer attributeType;

    /**
     * 是否启用
     *
     * @mbg.generated
     */
    private Boolean isEnabled;

    /**
     * 是否必须
     *
     * @mbg.generated
     */
    private Boolean isRequired;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 排序
     *
     * @mbg.generated
     */
    private Integer orderList;

    /**
     * 商品类型ID
     *
     * @mbg.generated
     */
    private String productTypeId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getMtime() {
        return mtime;
    }

    public void setMtime(Long mtime) {
        this.mtime = mtime;
    }

    public String getAttributeOptionStore() {
        return attributeOptionStore;
    }

    public void setAttributeOptionStore(String attributeOptionStore) {
        this.attributeOptionStore = attributeOptionStore;
    }

    public Integer getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(Integer attributeType) {
        this.attributeType = attributeType;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderList() {
        return orderList;
    }

    public void setOrderList(Integer orderList) {
        this.orderList = orderList;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ctime=").append(ctime);
        sb.append(", mtime=").append(mtime);
        sb.append(", attributeOptionStore=").append(attributeOptionStore);
        sb.append(", attributeType=").append(attributeType);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", isRequired=").append(isRequired);
        sb.append(", name=").append(name);
        sb.append(", orderList=").append(orderList);
        sb.append(", productTypeId=").append(productTypeId);
        sb.append("]");
        return sb.toString();
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
        ShopProductAttribute other = (ShopProductAttribute) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getAttributeOptionStore() == null ? other.getAttributeOptionStore() == null : this.getAttributeOptionStore().equals(other.getAttributeOptionStore()))
            && (this.getAttributeType() == null ? other.getAttributeType() == null : this.getAttributeType().equals(other.getAttributeType()))
            && (this.getIsEnabled() == null ? other.getIsEnabled() == null : this.getIsEnabled().equals(other.getIsEnabled()))
            && (this.getIsRequired() == null ? other.getIsRequired() == null : this.getIsRequired().equals(other.getIsRequired()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOrderList() == null ? other.getOrderList() == null : this.getOrderList().equals(other.getOrderList()))
            && (this.getProductTypeId() == null ? other.getProductTypeId() == null : this.getProductTypeId().equals(other.getProductTypeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getAttributeOptionStore() == null) ? 0 : getAttributeOptionStore().hashCode());
        result = prime * result + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        result = prime * result + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        result = prime * result + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOrderList() == null) ? 0 : getOrderList().hashCode());
        result = prime * result + ((getProductTypeId() == null) ? 0 : getProductTypeId().hashCode());
        return result;
    }
}