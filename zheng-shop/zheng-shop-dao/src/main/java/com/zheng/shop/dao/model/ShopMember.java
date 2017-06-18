package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ShopMember implements Serializable {
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

    private BigDecimal deposit;

    private String email;

    private Boolean isAccountEnabled;

    private Boolean isAccountLocked;

    private Date lockedDate;

    private Date loginDate;

    private Integer loginFailureCount;

    private String loginIp;

    private String password;

    private String passwordRecoverKey;

    private Integer point;

    private String registerIp;

    private String safeAnswer;

    private String safeQuestion;

    private String username;

    private String memberRankId;

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

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsAccountEnabled() {
        return isAccountEnabled;
    }

    public void setIsAccountEnabled(Boolean isAccountEnabled) {
        this.isAccountEnabled = isAccountEnabled;
    }

    public Boolean getIsAccountLocked() {
        return isAccountLocked;
    }

    public void setIsAccountLocked(Boolean isAccountLocked) {
        this.isAccountLocked = isAccountLocked;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRecoverKey() {
        return passwordRecoverKey;
    }

    public void setPasswordRecoverKey(String passwordRecoverKey) {
        this.passwordRecoverKey = passwordRecoverKey;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getSafeAnswer() {
        return safeAnswer;
    }

    public void setSafeAnswer(String safeAnswer) {
        this.safeAnswer = safeAnswer;
    }

    public String getSafeQuestion() {
        return safeQuestion;
    }

    public void setSafeQuestion(String safeQuestion) {
        this.safeQuestion = safeQuestion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMemberRankId() {
        return memberRankId;
    }

    public void setMemberRankId(String memberRankId) {
        this.memberRankId = memberRankId;
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
        sb.append(", deposit=").append(deposit);
        sb.append(", email=").append(email);
        sb.append(", isAccountEnabled=").append(isAccountEnabled);
        sb.append(", isAccountLocked=").append(isAccountLocked);
        sb.append(", lockedDate=").append(lockedDate);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", loginFailureCount=").append(loginFailureCount);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", password=").append(password);
        sb.append(", passwordRecoverKey=").append(passwordRecoverKey);
        sb.append(", point=").append(point);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", safeAnswer=").append(safeAnswer);
        sb.append(", safeQuestion=").append(safeQuestion);
        sb.append(", username=").append(username);
        sb.append(", memberRankId=").append(memberRankId);
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
        ShopMember other = (ShopMember) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getDeposit() == null ? other.getDeposit() == null : this.getDeposit().equals(other.getDeposit()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getIsAccountEnabled() == null ? other.getIsAccountEnabled() == null : this.getIsAccountEnabled().equals(other.getIsAccountEnabled()))
            && (this.getIsAccountLocked() == null ? other.getIsAccountLocked() == null : this.getIsAccountLocked().equals(other.getIsAccountLocked()))
            && (this.getLockedDate() == null ? other.getLockedDate() == null : this.getLockedDate().equals(other.getLockedDate()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()))
            && (this.getLoginFailureCount() == null ? other.getLoginFailureCount() == null : this.getLoginFailureCount().equals(other.getLoginFailureCount()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPasswordRecoverKey() == null ? other.getPasswordRecoverKey() == null : this.getPasswordRecoverKey().equals(other.getPasswordRecoverKey()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getRegisterIp() == null ? other.getRegisterIp() == null : this.getRegisterIp().equals(other.getRegisterIp()))
            && (this.getSafeAnswer() == null ? other.getSafeAnswer() == null : this.getSafeAnswer().equals(other.getSafeAnswer()))
            && (this.getSafeQuestion() == null ? other.getSafeQuestion() == null : this.getSafeQuestion().equals(other.getSafeQuestion()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getMemberRankId() == null ? other.getMemberRankId() == null : this.getMemberRankId().equals(other.getMemberRankId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getDeposit() == null) ? 0 : getDeposit().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getIsAccountEnabled() == null) ? 0 : getIsAccountEnabled().hashCode());
        result = prime * result + ((getIsAccountLocked() == null) ? 0 : getIsAccountLocked().hashCode());
        result = prime * result + ((getLockedDate() == null) ? 0 : getLockedDate().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        result = prime * result + ((getLoginFailureCount() == null) ? 0 : getLoginFailureCount().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPasswordRecoverKey() == null) ? 0 : getPasswordRecoverKey().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getRegisterIp() == null) ? 0 : getRegisterIp().hashCode());
        result = prime * result + ((getSafeAnswer() == null) ? 0 : getSafeAnswer().hashCode());
        result = prime * result + ((getSafeQuestion() == null) ? 0 : getSafeQuestion().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getMemberRankId() == null) ? 0 : getMemberRankId().hashCode());
        return result;
    }
}