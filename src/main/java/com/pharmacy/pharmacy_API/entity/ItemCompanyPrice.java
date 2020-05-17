/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.pharmacy_API.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author User
 */
@Entity
@Table(name = "item_company_price", catalog = "pharmacy", schema = "")
public class ItemCompanyPrice implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITM_SERIAL")
    private Double itmSerial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COM_CODE")
    private String comCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "PRT_CODE")
    private String prtCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ICP_PRICE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icpPriceDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ICP_PRICE")
    private BigDecimal icpPrice;
    @Size(max = 100)
    @Column(name = "ICP_REMARKS")
    private String icpRemarks;
    @Size(max = 8)
    @Column(name = "SEC_UPDATE_UID")
    private String secUpdateUid;
    @Column(name = "SEC_UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date secUpdateDate;
    @Size(max = 8)
    @Column(name = "SEC_INSERT_UID")
    private String secInsertUid;
    @Column(name = "SEC_INSERT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date secInsertDate;
    @Size(max = 50)
    @Column(name = "ICP_QTY")
    private String icpQty;
    @Size(max = 50)
    @Column(name = "ICP_VALUE")
    private String icpValue;
    @Size(max = 50)
    @Column(name = "ICP_DISCOUNT")
    private String icpDiscount;
    @Size(max = 50)
    @Column(name = "ICP_DISCOUNT_VALUE")
    private String icpDiscountValue;
    @Size(max = 100)
    @Column(name = "ICP_PRICE_FACTOR")
    private String icpPriceFactor;
    @Size(max = 50)
    @Column(name = "ICP_SALES_TAX_2")
    private String icpSalesTax2;
    @Size(max = 50)
    @Column(name = "icp_discount1")
    private String icpDiscount1;
    @Size(max = 50)
    @Column(name = "icp_discount2")
    private String icpDiscount2;
    @Size(max = 50)
    @Column(name = "icp_discount3")
    private String icpDiscount3;
    @Size(max = 50)
    @Column(name = "icp_price_befor_3disc")
    private String icpPriceBefor3disc;

    public ItemCompanyPrice() {
    }

    public ItemCompanyPrice(Double itmSerial) {
        this.itmSerial = itmSerial;
    }

    public ItemCompanyPrice(Double itmSerial, String comCode, String prtCode, Date icpPriceDate, BigDecimal icpPrice) {
        this.itmSerial = itmSerial;
        this.comCode = comCode;
        this.prtCode = prtCode;
        this.icpPriceDate = icpPriceDate;
        this.icpPrice = icpPrice;
    }

    public Double getItmSerial() {
        return itmSerial;
    }

    public void setItmSerial(Double itmSerial) {
        this.itmSerial = itmSerial;
    }

    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }

    public String getPrtCode() {
        return prtCode;
    }

    public void setPrtCode(String prtCode) {
        this.prtCode = prtCode;
    }

    public Date getIcpPriceDate() {
        return icpPriceDate;
    }

    public void setIcpPriceDate(Date icpPriceDate) {
        this.icpPriceDate = icpPriceDate;
    }

    public BigDecimal getIcpPrice() {
        return icpPrice;
    }

    public void setIcpPrice(BigDecimal icpPrice) {
        this.icpPrice = icpPrice;
    }

    public String getIcpRemarks() {
        return icpRemarks;
    }

    public void setIcpRemarks(String icpRemarks) {
        this.icpRemarks = icpRemarks;
    }

    public String getSecUpdateUid() {
        return secUpdateUid;
    }

    public void setSecUpdateUid(String secUpdateUid) {
        this.secUpdateUid = secUpdateUid;
    }

    public Date getSecUpdateDate() {
        return secUpdateDate;
    }

    public void setSecUpdateDate(Date secUpdateDate) {
        this.secUpdateDate = secUpdateDate;
    }

    public String getSecInsertUid() {
        return secInsertUid;
    }

    public void setSecInsertUid(String secInsertUid) {
        this.secInsertUid = secInsertUid;
    }

    public Date getSecInsertDate() {
        return secInsertDate;
    }

    public void setSecInsertDate(Date secInsertDate) {
        this.secInsertDate = secInsertDate;
    }

    public String getIcpQty() {
        return icpQty;
    }

    public void setIcpQty(String icpQty) {
        this.icpQty = icpQty;
    }

    public String getIcpValue() {
        return icpValue;
    }

    public void setIcpValue(String icpValue) {
        this.icpValue = icpValue;
    }

    public String getIcpDiscount() {
        return icpDiscount;
    }

    public void setIcpDiscount(String icpDiscount) {
        this.icpDiscount = icpDiscount;
    }

    public String getIcpDiscountValue() {
        return icpDiscountValue;
    }

    public void setIcpDiscountValue(String icpDiscountValue) {
        this.icpDiscountValue = icpDiscountValue;
    }

    public String getIcpPriceFactor() {
        return icpPriceFactor;
    }

    public void setIcpPriceFactor(String icpPriceFactor) {
        this.icpPriceFactor = icpPriceFactor;
    }

    public String getIcpSalesTax2() {
        return icpSalesTax2;
    }

    public void setIcpSalesTax2(String icpSalesTax2) {
        this.icpSalesTax2 = icpSalesTax2;
    }

    public String getIcpDiscount1() {
        return icpDiscount1;
    }

    public void setIcpDiscount1(String icpDiscount1) {
        this.icpDiscount1 = icpDiscount1;
    }

    public String getIcpDiscount2() {
        return icpDiscount2;
    }

    public void setIcpDiscount2(String icpDiscount2) {
        this.icpDiscount2 = icpDiscount2;
    }

    public String getIcpDiscount3() {
        return icpDiscount3;
    }

    public void setIcpDiscount3(String icpDiscount3) {
        this.icpDiscount3 = icpDiscount3;
    }

    public String getIcpPriceBefor3disc() {
        return icpPriceBefor3disc;
    }

    public void setIcpPriceBefor3disc(String icpPriceBefor3disc) {
        this.icpPriceBefor3disc = icpPriceBefor3disc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itmSerial != null ? itmSerial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemCompanyPrice)) {
            return false;
        }
        ItemCompanyPrice other = (ItemCompanyPrice) object;
        if ((this.itmSerial == null && other.itmSerial != null) || (this.itmSerial != null && !this.itmSerial.equals(other.itmSerial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.luv2code.springboot.cruddemo.entity.ItemCompanyPrice[ itmSerial=" + itmSerial + " ]";
    }
    
}
