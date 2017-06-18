package com.zheng.shop.dao.model;

import java.io.Serializable;

public class ShopProductAttributeMapStore implements Serializable {
    /**
     * 商品ID
     *
     * @mbg.generated
     */
    private String productId;

    /**
     * 属性ID
     *
     * @mbg.generated
     */
    private String mapkeyId;

    /**
     * 元素
     *
     * @mbg.generated
     */
    private String element;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMapkeyId() {
        return mapkeyId;
    }

    public void setMapkeyId(String mapkeyId) {
        this.mapkeyId = mapkeyId;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", mapkeyId=").append(mapkeyId);
        sb.append(", element=").append(element);
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
        ShopProductAttributeMapStore other = (ShopProductAttributeMapStore) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getMapkeyId() == null ? other.getMapkeyId() == null : this.getMapkeyId().equals(other.getMapkeyId()))
            && (this.getElement() == null ? other.getElement() == null : this.getElement().equals(other.getElement()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getMapkeyId() == null) ? 0 : getMapkeyId().hashCode());
        result = prime * result + ((getElement() == null) ? 0 : getElement().hashCode());
        return result;
    }
}