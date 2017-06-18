package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ShopProduct implements Serializable {
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

    private Integer freezeStore;

    /**
     * HTML页面路径
     *
     * @mbg.generated
     */
    private String htmlFilePath;

    /**
     * 是否精品:false=否，true=是
     *
     * @mbg.generated
     */
    private Boolean isBest;

    /**
     * 是否热销:false=否，true=是
     *
     * @mbg.generated
     */
    private Boolean isHot;

    /**
     * 是否上架:true=上架，false=下架
     *
     * @mbg.generated
     */
    private Boolean isMarketable;

    /**
     * 是否新品:false=否，true=是
     *
     * @mbg.generated
     */
    private Boolean isNew;

    /**
     * 市场价
     *
     * @mbg.generated
     */
    private BigDecimal marketPrice;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 积分
     *
     * @mbg.generated
     */
    private Integer point;

    /**
     * 价格
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 商品编码
     *
     * @mbg.generated
     */
    private String productSn;

    /**
     * 库存
     *
     * @mbg.generated
     */
    private Integer store;

    /**
     * 重量
     *
     * @mbg.generated
     */
    private Double weight;

    private Integer weightUnit;

    /**
     * 品牌ID
     *
     * @mbg.generated
     */
    private String brandId;

    /**
     * 商品分类ID
     *
     * @mbg.generated
     */
    private String productCategoryId;

    /**
     * 商品类型ID
     *
     * @mbg.generated
     */
    private String productTypeId;

    /**
     * 是否删除
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 页面描述
     *
     * @mbg.generated
     */
    private String metaDescription;

    /**
     * 关键字
     *
     * @mbg.generated
     */
    private String metaKeywords;

    /**
     * 图片列表
     *
     * @mbg.generated
     */
    private String productImageListStore;

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

    public Integer getFreezeStore() {
        return freezeStore;
    }

    public void setFreezeStore(Integer freezeStore) {
        this.freezeStore = freezeStore;
    }

    public String getHtmlFilePath() {
        return htmlFilePath;
    }

    public void setHtmlFilePath(String htmlFilePath) {
        this.htmlFilePath = htmlFilePath;
    }

    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(Integer weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getProductImageListStore() {
        return productImageListStore;
    }

    public void setProductImageListStore(String productImageListStore) {
        this.productImageListStore = productImageListStore;
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
        sb.append(", freezeStore=").append(freezeStore);
        sb.append(", htmlFilePath=").append(htmlFilePath);
        sb.append(", isBest=").append(isBest);
        sb.append(", isHot=").append(isHot);
        sb.append(", isMarketable=").append(isMarketable);
        sb.append(", isNew=").append(isNew);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", name=").append(name);
        sb.append(", point=").append(point);
        sb.append(", price=").append(price);
        sb.append(", productSn=").append(productSn);
        sb.append(", store=").append(store);
        sb.append(", weight=").append(weight);
        sb.append(", weightUnit=").append(weightUnit);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productTypeId=").append(productTypeId);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", description=").append(description);
        sb.append(", metaDescription=").append(metaDescription);
        sb.append(", metaKeywords=").append(metaKeywords);
        sb.append(", productImageListStore=").append(productImageListStore);
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
        ShopProduct other = (ShopProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getFreezeStore() == null ? other.getFreezeStore() == null : this.getFreezeStore().equals(other.getFreezeStore()))
            && (this.getHtmlFilePath() == null ? other.getHtmlFilePath() == null : this.getHtmlFilePath().equals(other.getHtmlFilePath()))
            && (this.getIsBest() == null ? other.getIsBest() == null : this.getIsBest().equals(other.getIsBest()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getIsMarketable() == null ? other.getIsMarketable() == null : this.getIsMarketable().equals(other.getIsMarketable()))
            && (this.getIsNew() == null ? other.getIsNew() == null : this.getIsNew().equals(other.getIsNew()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getProductSn() == null ? other.getProductSn() == null : this.getProductSn().equals(other.getProductSn()))
            && (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getWeightUnit() == null ? other.getWeightUnit() == null : this.getWeightUnit().equals(other.getWeightUnit()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getProductCategoryId() == null ? other.getProductCategoryId() == null : this.getProductCategoryId().equals(other.getProductCategoryId()))
            && (this.getProductTypeId() == null ? other.getProductTypeId() == null : this.getProductTypeId().equals(other.getProductTypeId()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getMetaDescription() == null ? other.getMetaDescription() == null : this.getMetaDescription().equals(other.getMetaDescription()))
            && (this.getMetaKeywords() == null ? other.getMetaKeywords() == null : this.getMetaKeywords().equals(other.getMetaKeywords()))
            && (this.getProductImageListStore() == null ? other.getProductImageListStore() == null : this.getProductImageListStore().equals(other.getProductImageListStore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getFreezeStore() == null) ? 0 : getFreezeStore().hashCode());
        result = prime * result + ((getHtmlFilePath() == null) ? 0 : getHtmlFilePath().hashCode());
        result = prime * result + ((getIsBest() == null) ? 0 : getIsBest().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getIsMarketable() == null) ? 0 : getIsMarketable().hashCode());
        result = prime * result + ((getIsNew() == null) ? 0 : getIsNew().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getProductSn() == null) ? 0 : getProductSn().hashCode());
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getWeightUnit() == null) ? 0 : getWeightUnit().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getProductCategoryId() == null) ? 0 : getProductCategoryId().hashCode());
        result = prime * result + ((getProductTypeId() == null) ? 0 : getProductTypeId().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getMetaDescription() == null) ? 0 : getMetaDescription().hashCode());
        result = prime * result + ((getMetaKeywords() == null) ? 0 : getMetaKeywords().hashCode());
        result = prime * result + ((getProductImageListStore() == null) ? 0 : getProductImageListStore().hashCode());
        return result;
    }
}