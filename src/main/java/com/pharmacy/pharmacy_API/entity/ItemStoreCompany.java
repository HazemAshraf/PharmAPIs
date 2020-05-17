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

/**
 *
 * @author User
 */
@Entity
@Table(name = "item_store_company", catalog = "pharmacy", schema = "")
 public class ItemStoreCompany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "STO_CODE")
    private String stoCode;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITM_SERIAL")
    private Integer itmSerial;
    @Size(max = 100)
    @Column(name = "ISC_MAX_LIMIT")
    private String iscMaxLimit;
    @Size(max = 100)
    @Column(name = "ISC_MIN_LIMIT")
    private String iscMinLimit;
    @Size(max = 100)
    @Column(name = "ISC_SAFETY_STOCK")
    private String iscSafetyStock;
    @Size(max = 100)
    @Column(name = "ISC_REORDER_POINT")
    private String iscReorderPoint;
    @Size(max = 100)
    @Column(name = "ISC_AVR_CONSUMPTION_DAY")
    private String iscAvrConsumptionDay;
    @Size(max = 100)
    @Column(name = "ISC_AVR_CONSUMPTION_MONTH")
    private String iscAvrConsumptionMonth;
    @Size(max = 100)
    @Column(name = "ISC_AVR_CONSUMPTION_YEAR")
    private String iscAvrConsumptionYear;
    @Size(max = 100)
    @Column(name = "ISC_DISCOUNT_1")
    private String iscDiscount1;
    @Size(max = 100)
    @Column(name = "ISC_DISCOUNT_2")
    private String iscDiscount2;
    @Size(max = 100)
    @Column(name = "ISC_DISCOUNT_3")
    private String iscDiscount3;
    @Size(max = 100)
    @Column(name = "ISC_LOCATION")
    private String iscLocation;
    @Size(max = 100)
    @Column(name = "ISC_OPEN_BALANCE")
    private String iscOpenBalance;
    @Size(max = 100)
    @Column(name = "ISC_ALLOCATED_FROM_BALANCE")
    private String iscAllocatedFromBalance;
    @Size(max = 100)
    @Column(name = "ISC_ALLOCATED_OUT_BALANCE")
    private String iscAllocatedOutBalance;
    @Size(max = 100)
    @Column(name = "ISC_PO")
    private String iscPo;
    @Size(max = 100)
    @Column(name = "ISC_RECIVED")
    private String iscRecived;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ISC_CURRENT_BALANCE")
    private Double iscCurrentBalance;
    @Size(max = 100)
    @Column(name = "ISC_LAST_ISSUE_DATE")
    private String iscLastIssueDate;
    @Size(max = 100)
    @Column(name = "ISC_LAST_ADD_DATE")
    private String iscLastAddDate;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_0")
    private String iscBalance0;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_1")
    private String iscBalance1;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_2")
    private String iscBalance2;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_3")
    private String iscBalance3;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_4")
    private String iscBalance4;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_5")
    private String iscBalance5;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_6")
    private String iscBalance6;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_7")
    private String iscBalance7;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_8")
    private String iscBalance8;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_9")
    private String iscBalance9;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_10")
    private String iscBalance10;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_11")
    private String iscBalance11;
    @Size(max = 100)
    @Column(name = "ISC_BALANCE_12")
    private String iscBalance12;
    @Size(max = 100)
    @Column(name = "COM_CODE")
    private String comCode;
    @Size(max = 100)
    @Column(name = "SEC_UPDATE_UID")
    private String secUpdateUid;
    @Size(max = 100)
    @Column(name = "SEC_UPDATE_DATE")
    private String secUpdateDate;
    @Size(max = 100)
    @Column(name = "SEC_INSERT_UID")
    private String secInsertUid;
    @Size(max = 100)
    @Column(name = "SEC_INSERT_DATE")
    private String secInsertDate;
    @Size(max = 100)
    @Column(name = "CHRT_SERIAL")
    private String chrtSerial;
    @Size(max = 100)
    @Column(name = "SATUS_FLAG")
    private String satusFlag;
    @Size(max = 100)
    @Column(name = "ISC_LAST_MONTH")
    private String iscLastMonth;
    @Size(max = 100)
    @Column(name = "ISC_LAST_YEAR")
    private String iscLastYear;
    @Size(max = 100)
    @Column(name = "ITT_CODE")
    private String ittCode;
    @Column(name = "ISC_TRANS_DONE")
    private Integer iscTransDone;
    @Size(max = 100)
    @Column(name = "ISC_LAST_INVENTORY_DATE")
    private String iscLastInventoryDate;
    @Size(max = 100)
    @Column(name = "isc_tax_value")
    private String iscTaxValue;
    @Size(max = 100)
    @Column(name = "isc_count_cycle")
    private String iscCountCycle;
    @Size(max = 100)
    @Column(name = "added_profit")
    private String addedProfit;
    @Size(max = 100)
    @Column(name = "cash_disc")
    private String cashDisc;
    @Column(name = "issue_return_flag")
    private Integer issueReturnFlag;
    @Size(max = 100)
    @Column(name = "item_user")
    private String itemUser;
    @Column(name = "isc_iss_max_discount")
    private Integer iscIssMaxDiscount;

    public ItemStoreCompany() {
    }

    public ItemStoreCompany(Integer itmSerial) {
        this.itmSerial = itmSerial;
    }

    public String getStoCode() {
        return stoCode;
    }

    public void setStoCode(String stoCode) {
        this.stoCode = stoCode;
    }

    public Integer getItmSerial() {
        return itmSerial;
    }

    public void setItmSerial(Integer itmSerial) {
        this.itmSerial = itmSerial;
    }

    public String getIscMaxLimit() {
        return iscMaxLimit;
    }

    public void setIscMaxLimit(String iscMaxLimit) {
        this.iscMaxLimit = iscMaxLimit;
    }

    public String getIscMinLimit() {
        return iscMinLimit;
    }

    public void setIscMinLimit(String iscMinLimit) {
        this.iscMinLimit = iscMinLimit;
    }

    public String getIscSafetyStock() {
        return iscSafetyStock;
    }

    public void setIscSafetyStock(String iscSafetyStock) {
        this.iscSafetyStock = iscSafetyStock;
    }

    public String getIscReorderPoint() {
        return iscReorderPoint;
    }

    public void setIscReorderPoint(String iscReorderPoint) {
        this.iscReorderPoint = iscReorderPoint;
    }

    public String getIscAvrConsumptionDay() {
        return iscAvrConsumptionDay;
    }

    public void setIscAvrConsumptionDay(String iscAvrConsumptionDay) {
        this.iscAvrConsumptionDay = iscAvrConsumptionDay;
    }

    public String getIscAvrConsumptionMonth() {
        return iscAvrConsumptionMonth;
    }

    public void setIscAvrConsumptionMonth(String iscAvrConsumptionMonth) {
        this.iscAvrConsumptionMonth = iscAvrConsumptionMonth;
    }

    public String getIscAvrConsumptionYear() {
        return iscAvrConsumptionYear;
    }

    public void setIscAvrConsumptionYear(String iscAvrConsumptionYear) {
        this.iscAvrConsumptionYear = iscAvrConsumptionYear;
    }

    public String getIscDiscount1() {
        return iscDiscount1;
    }

    public void setIscDiscount1(String iscDiscount1) {
        this.iscDiscount1 = iscDiscount1;
    }

    public String getIscDiscount2() {
        return iscDiscount2;
    }

    public void setIscDiscount2(String iscDiscount2) {
        this.iscDiscount2 = iscDiscount2;
    }

    public String getIscDiscount3() {
        return iscDiscount3;
    }

    public void setIscDiscount3(String iscDiscount3) {
        this.iscDiscount3 = iscDiscount3;
    }

    public String getIscLocation() {
        return iscLocation;
    }

    public void setIscLocation(String iscLocation) {
        this.iscLocation = iscLocation;
    }

    public String getIscOpenBalance() {
        return iscOpenBalance;
    }

    public void setIscOpenBalance(String iscOpenBalance) {
        this.iscOpenBalance = iscOpenBalance;
    }

    public String getIscAllocatedFromBalance() {
        return iscAllocatedFromBalance;
    }

    public void setIscAllocatedFromBalance(String iscAllocatedFromBalance) {
        this.iscAllocatedFromBalance = iscAllocatedFromBalance;
    }

    public String getIscAllocatedOutBalance() {
        return iscAllocatedOutBalance;
    }

    public void setIscAllocatedOutBalance(String iscAllocatedOutBalance) {
        this.iscAllocatedOutBalance = iscAllocatedOutBalance;
    }

    public String getIscPo() {
        return iscPo;
    }

    public void setIscPo(String iscPo) {
        this.iscPo = iscPo;
    }

    public String getIscRecived() {
        return iscRecived;
    }

    public void setIscRecived(String iscRecived) {
        this.iscRecived = iscRecived;
    }

    public Double getIscCurrentBalance() {
        return iscCurrentBalance;
    }

    public void setIscCurrentBalance(Double iscCurrentBalance) {
        this.iscCurrentBalance = iscCurrentBalance;
    }

    public String getIscLastIssueDate() {
        return iscLastIssueDate;
    }

    public void setIscLastIssueDate(String iscLastIssueDate) {
        this.iscLastIssueDate = iscLastIssueDate;
    }

    public String getIscLastAddDate() {
        return iscLastAddDate;
    }

    public void setIscLastAddDate(String iscLastAddDate) {
        this.iscLastAddDate = iscLastAddDate;
    }

    public String getIscBalance0() {
        return iscBalance0;
    }

    public void setIscBalance0(String iscBalance0) {
        this.iscBalance0 = iscBalance0;
    }

    public String getIscBalance1() {
        return iscBalance1;
    }

    public void setIscBalance1(String iscBalance1) {
        this.iscBalance1 = iscBalance1;
    }

    public String getIscBalance2() {
        return iscBalance2;
    }

    public void setIscBalance2(String iscBalance2) {
        this.iscBalance2 = iscBalance2;
    }

    public String getIscBalance3() {
        return iscBalance3;
    }

    public void setIscBalance3(String iscBalance3) {
        this.iscBalance3 = iscBalance3;
    }

    public String getIscBalance4() {
        return iscBalance4;
    }

    public void setIscBalance4(String iscBalance4) {
        this.iscBalance4 = iscBalance4;
    }

    public String getIscBalance5() {
        return iscBalance5;
    }

    public void setIscBalance5(String iscBalance5) {
        this.iscBalance5 = iscBalance5;
    }

    public String getIscBalance6() {
        return iscBalance6;
    }

    public void setIscBalance6(String iscBalance6) {
        this.iscBalance6 = iscBalance6;
    }

    public String getIscBalance7() {
        return iscBalance7;
    }

    public void setIscBalance7(String iscBalance7) {
        this.iscBalance7 = iscBalance7;
    }

    public String getIscBalance8() {
        return iscBalance8;
    }

    public void setIscBalance8(String iscBalance8) {
        this.iscBalance8 = iscBalance8;
    }

    public String getIscBalance9() {
        return iscBalance9;
    }

    public void setIscBalance9(String iscBalance9) {
        this.iscBalance9 = iscBalance9;
    }

    public String getIscBalance10() {
        return iscBalance10;
    }

    public void setIscBalance10(String iscBalance10) {
        this.iscBalance10 = iscBalance10;
    }

    public String getIscBalance11() {
        return iscBalance11;
    }

    public void setIscBalance11(String iscBalance11) {
        this.iscBalance11 = iscBalance11;
    }

    public String getIscBalance12() {
        return iscBalance12;
    }

    public void setIscBalance12(String iscBalance12) {
        this.iscBalance12 = iscBalance12;
    }

    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }

    public String getSecUpdateUid() {
        return secUpdateUid;
    }

    public void setSecUpdateUid(String secUpdateUid) {
        this.secUpdateUid = secUpdateUid;
    }

    public String getSecUpdateDate() {
        return secUpdateDate;
    }

    public void setSecUpdateDate(String secUpdateDate) {
        this.secUpdateDate = secUpdateDate;
    }

    public String getSecInsertUid() {
        return secInsertUid;
    }

    public void setSecInsertUid(String secInsertUid) {
        this.secInsertUid = secInsertUid;
    }

    public String getSecInsertDate() {
        return secInsertDate;
    }

    public void setSecInsertDate(String secInsertDate) {
        this.secInsertDate = secInsertDate;
    }

    public String getChrtSerial() {
        return chrtSerial;
    }

    public void setChrtSerial(String chrtSerial) {
        this.chrtSerial = chrtSerial;
    }

    public String getSatusFlag() {
        return satusFlag;
    }

    public void setSatusFlag(String satusFlag) {
        this.satusFlag = satusFlag;
    }

    public String getIscLastMonth() {
        return iscLastMonth;
    }

    public void setIscLastMonth(String iscLastMonth) {
        this.iscLastMonth = iscLastMonth;
    }

    public String getIscLastYear() {
        return iscLastYear;
    }

    public void setIscLastYear(String iscLastYear) {
        this.iscLastYear = iscLastYear;
    }

    public String getIttCode() {
        return ittCode;
    }

    public void setIttCode(String ittCode) {
        this.ittCode = ittCode;
    }

    public Integer getIscTransDone() {
        return iscTransDone;
    }

    public void setIscTransDone(Integer iscTransDone) {
        this.iscTransDone = iscTransDone;
    }

    public String getIscLastInventoryDate() {
        return iscLastInventoryDate;
    }

    public void setIscLastInventoryDate(String iscLastInventoryDate) {
        this.iscLastInventoryDate = iscLastInventoryDate;
    }

    public String getIscTaxValue() {
        return iscTaxValue;
    }

    public void setIscTaxValue(String iscTaxValue) {
        this.iscTaxValue = iscTaxValue;
    }

    public String getIscCountCycle() {
        return iscCountCycle;
    }

    public void setIscCountCycle(String iscCountCycle) {
        this.iscCountCycle = iscCountCycle;
    }

    public String getAddedProfit() {
        return addedProfit;
    }

    public void setAddedProfit(String addedProfit) {
        this.addedProfit = addedProfit;
    }

    public String getCashDisc() {
        return cashDisc;
    }

    public void setCashDisc(String cashDisc) {
        this.cashDisc = cashDisc;
    }

    public Integer getIssueReturnFlag() {
        return issueReturnFlag;
    }

    public void setIssueReturnFlag(Integer issueReturnFlag) {
        this.issueReturnFlag = issueReturnFlag;
    }

    public String getItemUser() {
        return itemUser;
    }

    public void setItemUser(String itemUser) {
        this.itemUser = itemUser;
    }

    public Integer getIscIssMaxDiscount() {
        return iscIssMaxDiscount;
    }

    public void setIscIssMaxDiscount(Integer iscIssMaxDiscount) {
        this.iscIssMaxDiscount = iscIssMaxDiscount;
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
        if (!(object instanceof ItemStoreCompany)) {
            return false;
        }
        ItemStoreCompany other = (ItemStoreCompany) object;
        if ((this.itmSerial == null && other.itmSerial != null) || (this.itmSerial != null && !this.itmSerial.equals(other.itmSerial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.luv2code.springboot.cruddemo.entity.ItemStoreCompany[ itmSerial=" + itmSerial + " ]";
    }
    
}
