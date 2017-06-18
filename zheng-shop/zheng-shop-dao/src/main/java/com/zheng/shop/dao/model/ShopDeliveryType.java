package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ShopDeliveryType implements Serializable {
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

    private Double continueWeight;

    private BigDecimal continueWeightPrice;

    private Integer continueWeightUnit;

    private Integer deliveryMethod;

    private Double firstWeight;

    private BigDecimal firstWeightPrice;

    private Integer firstWeightUnit;

    private String name;

    private Integer orderList;

    private String defaultDeliveryCorpId;

    private String description;

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

    public Double getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(Double continueWeight) {
        this.continueWeight = continueWeight;
    }

    public BigDecimal getContinueWeightPrice() {
        return continueWeightPrice;
    }

    public void setContinueWeightPrice(BigDecimal continueWeightPrice) {
        this.continueWeightPrice = continueWeightPrice;
    }

    public Integer getContinueWeightUnit() {
        return continueWeightUnit;
    }

    public void setContinueWeightUnit(Integer continueWeightUnit) {
        this.continueWeightUnit = continueWeightUnit;
    }

    public Integer getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(Integer deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Double getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(Double firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getFirstWeightPrice() {
        return firstWeightPrice;
    }

    public void setFirstWeightPrice(BigDecimal firstWeightPrice) {
        this.firstWeightPrice = firstWeightPrice;
    }

    public Integer getFirstWeightUnit() {
        return firstWeightUnit;
    }

    public void setFirstWeightUnit(Integer firstWeightUnit) {
        this.firstWeightUnit = firstWeightUnit;
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

    public String getDefaultDeliveryCorpId() {
        return defaultDeliveryCorpId;
    }

    public void setDefaultDeliveryCorpId(String defaultDeliveryCorpId) {
        this.defaultDeliveryCorpId = defaultDeliveryCorpId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        sb.append(", continueWeight=").append(continueWeight);
        sb.append(", continueWeightPrice=").append(continueWeightPrice);
        sb.append(", continueWeightUnit=").append(continueWeightUnit);
        sb.append(", deliveryMethod=").append(deliveryMethod);
        sb.append(", firstWeight=").append(firstWeight);
        sb.append(", firstWeightPrice=").append(firstWeightPrice);
        sb.append(", firstWeightUnit=").append(firstWeightUnit);
        sb.append(", name=").append(name);
        sb.append(", orderList=").append(orderList);
        sb.append(", defaultDeliveryCorpId=").append(defaultDeliveryCorpId);
        sb.append(", description=").append(description);
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
        ShopDeliveryType other = (ShopDeliveryType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getContinueWeight() == null ? other.getContinueWeight() == null : this.getContinueWeight().equals(other.getContinueWeight()))
            && (this.getContinueWeightPrice() == null ? other.getContinueWeightPrice() == null : this.getContinueWeightPrice().equals(other.getContinueWeightPrice()))
            && (this.getContinueWeightUnit() == null ? other.getContinueWeightUnit() == null : this.getContinueWeightUnit().equals(other.getContinueWeightUnit()))
            && (this.getDeliveryMethod() == null ? other.getDeliveryMethod() == null : this.getDeliveryMethod().equals(other.getDeliveryMethod()))
            && (this.getFirstWeight() == null ? other.getFirstWeight() == null : this.getFirstWeight().equals(other.getFirstWeight()))
            && (this.getFirstWeightPrice() == null ? other.getFirstWeightPrice() == null : this.getFirstWeightPrice().equals(other.getFirstWeightPrice()))
            && (this.getFirstWeightUnit() == null ? other.getFirstWeightUnit() == null : this.getFirstWeightUnit().equals(other.getFirstWeightUnit()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOrderList() == null ? other.getOrderList() == null : this.getOrderList().equals(other.getOrderList()))
            && (this.getDefaultDeliveryCorpId() == null ? other.getDefaultDeliveryCorpId() == null : this.getDefaultDeliveryCorpId().equals(other.getDefaultDeliveryCorpId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getContinueWeight() == null) ? 0 : getContinueWeight().hashCode());
        result = prime * result + ((getContinueWeightPrice() == null) ? 0 : getContinueWeightPrice().hashCode());
        result = prime * result + ((getContinueWeightUnit() == null) ? 0 : getContinueWeightUnit().hashCode());
        result = prime * result + ((getDeliveryMethod() == null) ? 0 : getDeliveryMethod().hashCode());
        result = prime * result + ((getFirstWeight() == null) ? 0 : getFirstWeight().hashCode());
        result = prime * result + ((getFirstWeightPrice() == null) ? 0 : getFirstWeightPrice().hashCode());
        result = prime * result + ((getFirstWeightUnit() == null) ? 0 : getFirstWeightUnit().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOrderList() == null) ? 0 : getOrderList().hashCode());
        result = prime * result + ((getDefaultDeliveryCorpId() == null) ? 0 : getDefaultDeliveryCorpId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}