package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ShopOrders implements Serializable {
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

    private BigDecimal deliveryFee;

    private String deliveryTypeName;

    private String orderSn;

    private Integer orderStatus;

    private BigDecimal paidQmount;

    private String paymentConfigName;

    private BigDecimal paymentFee;

    private Integer paymentStatus;

    private BigDecimal productTotalPrice;

    private Integer productTotalQuantity;

    private Double productWeight;

    private Integer productWeightUnit;

    private String shipAddress;

    private String shipArea;

    private String shipAreaPath;

    private String shipMobile;

    private String shipName;

    private String shipPhone;

    private String shipZipCode;

    private Integer shippingStatus;

    private BigDecimal totalAmount;

    private String memberId;

    private String deliveryTypeId;

    private String paymentConfigId;

    private String memo;

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

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getDeliveryTypeName() {
        return deliveryTypeName;
    }

    public void setDeliveryTypeName(String deliveryTypeName) {
        this.deliveryTypeName = deliveryTypeName;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getPaidQmount() {
        return paidQmount;
    }

    public void setPaidQmount(BigDecimal paidQmount) {
        this.paidQmount = paidQmount;
    }

    public String getPaymentConfigName() {
        return paymentConfigName;
    }

    public void setPaymentConfigName(String paymentConfigName) {
        this.paymentConfigName = paymentConfigName;
    }

    public BigDecimal getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(BigDecimal paymentFee) {
        this.paymentFee = paymentFee;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public Integer getProductTotalQuantity() {
        return productTotalQuantity;
    }

    public void setProductTotalQuantity(Integer productTotalQuantity) {
        this.productTotalQuantity = productTotalQuantity;
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getProductWeightUnit() {
        return productWeightUnit;
    }

    public void setProductWeightUnit(Integer productWeightUnit) {
        this.productWeightUnit = productWeightUnit;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipArea() {
        return shipArea;
    }

    public void setShipArea(String shipArea) {
        this.shipArea = shipArea;
    }

    public String getShipAreaPath() {
        return shipAreaPath;
    }

    public void setShipAreaPath(String shipAreaPath) {
        this.shipAreaPath = shipAreaPath;
    }

    public String getShipMobile() {
        return shipMobile;
    }

    public void setShipMobile(String shipMobile) {
        this.shipMobile = shipMobile;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone;
    }

    public String getShipZipCode() {
        return shipZipCode;
    }

    public void setShipZipCode(String shipZipCode) {
        this.shipZipCode = shipZipCode;
    }

    public Integer getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(String deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public String getPaymentConfigId() {
        return paymentConfigId;
    }

    public void setPaymentConfigId(String paymentConfigId) {
        this.paymentConfigId = paymentConfigId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
        sb.append(", deliveryFee=").append(deliveryFee);
        sb.append(", deliveryTypeName=").append(deliveryTypeName);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", paidQmount=").append(paidQmount);
        sb.append(", paymentConfigName=").append(paymentConfigName);
        sb.append(", paymentFee=").append(paymentFee);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", productTotalPrice=").append(productTotalPrice);
        sb.append(", productTotalQuantity=").append(productTotalQuantity);
        sb.append(", productWeight=").append(productWeight);
        sb.append(", productWeightUnit=").append(productWeightUnit);
        sb.append(", shipAddress=").append(shipAddress);
        sb.append(", shipArea=").append(shipArea);
        sb.append(", shipAreaPath=").append(shipAreaPath);
        sb.append(", shipMobile=").append(shipMobile);
        sb.append(", shipName=").append(shipName);
        sb.append(", shipPhone=").append(shipPhone);
        sb.append(", shipZipCode=").append(shipZipCode);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", memberId=").append(memberId);
        sb.append(", deliveryTypeId=").append(deliveryTypeId);
        sb.append(", paymentConfigId=").append(paymentConfigId);
        sb.append(", memo=").append(memo);
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
        ShopOrders other = (ShopOrders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getDeliveryFee() == null ? other.getDeliveryFee() == null : this.getDeliveryFee().equals(other.getDeliveryFee()))
            && (this.getDeliveryTypeName() == null ? other.getDeliveryTypeName() == null : this.getDeliveryTypeName().equals(other.getDeliveryTypeName()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getPaidQmount() == null ? other.getPaidQmount() == null : this.getPaidQmount().equals(other.getPaidQmount()))
            && (this.getPaymentConfigName() == null ? other.getPaymentConfigName() == null : this.getPaymentConfigName().equals(other.getPaymentConfigName()))
            && (this.getPaymentFee() == null ? other.getPaymentFee() == null : this.getPaymentFee().equals(other.getPaymentFee()))
            && (this.getPaymentStatus() == null ? other.getPaymentStatus() == null : this.getPaymentStatus().equals(other.getPaymentStatus()))
            && (this.getProductTotalPrice() == null ? other.getProductTotalPrice() == null : this.getProductTotalPrice().equals(other.getProductTotalPrice()))
            && (this.getProductTotalQuantity() == null ? other.getProductTotalQuantity() == null : this.getProductTotalQuantity().equals(other.getProductTotalQuantity()))
            && (this.getProductWeight() == null ? other.getProductWeight() == null : this.getProductWeight().equals(other.getProductWeight()))
            && (this.getProductWeightUnit() == null ? other.getProductWeightUnit() == null : this.getProductWeightUnit().equals(other.getProductWeightUnit()))
            && (this.getShipAddress() == null ? other.getShipAddress() == null : this.getShipAddress().equals(other.getShipAddress()))
            && (this.getShipArea() == null ? other.getShipArea() == null : this.getShipArea().equals(other.getShipArea()))
            && (this.getShipAreaPath() == null ? other.getShipAreaPath() == null : this.getShipAreaPath().equals(other.getShipAreaPath()))
            && (this.getShipMobile() == null ? other.getShipMobile() == null : this.getShipMobile().equals(other.getShipMobile()))
            && (this.getShipName() == null ? other.getShipName() == null : this.getShipName().equals(other.getShipName()))
            && (this.getShipPhone() == null ? other.getShipPhone() == null : this.getShipPhone().equals(other.getShipPhone()))
            && (this.getShipZipCode() == null ? other.getShipZipCode() == null : this.getShipZipCode().equals(other.getShipZipCode()))
            && (this.getShippingStatus() == null ? other.getShippingStatus() == null : this.getShippingStatus().equals(other.getShippingStatus()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getDeliveryTypeId() == null ? other.getDeliveryTypeId() == null : this.getDeliveryTypeId().equals(other.getDeliveryTypeId()))
            && (this.getPaymentConfigId() == null ? other.getPaymentConfigId() == null : this.getPaymentConfigId().equals(other.getPaymentConfigId()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getDeliveryFee() == null) ? 0 : getDeliveryFee().hashCode());
        result = prime * result + ((getDeliveryTypeName() == null) ? 0 : getDeliveryTypeName().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getPaidQmount() == null) ? 0 : getPaidQmount().hashCode());
        result = prime * result + ((getPaymentConfigName() == null) ? 0 : getPaymentConfigName().hashCode());
        result = prime * result + ((getPaymentFee() == null) ? 0 : getPaymentFee().hashCode());
        result = prime * result + ((getPaymentStatus() == null) ? 0 : getPaymentStatus().hashCode());
        result = prime * result + ((getProductTotalPrice() == null) ? 0 : getProductTotalPrice().hashCode());
        result = prime * result + ((getProductTotalQuantity() == null) ? 0 : getProductTotalQuantity().hashCode());
        result = prime * result + ((getProductWeight() == null) ? 0 : getProductWeight().hashCode());
        result = prime * result + ((getProductWeightUnit() == null) ? 0 : getProductWeightUnit().hashCode());
        result = prime * result + ((getShipAddress() == null) ? 0 : getShipAddress().hashCode());
        result = prime * result + ((getShipArea() == null) ? 0 : getShipArea().hashCode());
        result = prime * result + ((getShipAreaPath() == null) ? 0 : getShipAreaPath().hashCode());
        result = prime * result + ((getShipMobile() == null) ? 0 : getShipMobile().hashCode());
        result = prime * result + ((getShipName() == null) ? 0 : getShipName().hashCode());
        result = prime * result + ((getShipPhone() == null) ? 0 : getShipPhone().hashCode());
        result = prime * result + ((getShipZipCode() == null) ? 0 : getShipZipCode().hashCode());
        result = prime * result + ((getShippingStatus() == null) ? 0 : getShippingStatus().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getDeliveryTypeId() == null) ? 0 : getDeliveryTypeId().hashCode());
        result = prime * result + ((getPaymentConfigId() == null) ? 0 : getPaymentConfigId().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }
}