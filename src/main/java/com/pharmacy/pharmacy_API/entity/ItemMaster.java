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
 * @author Hazem
 */
@Entity
@Table(name = "item_master", catalog = "pharmacy", schema = "")
public class ItemMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITM_SERIAL")
    private Integer itmSerial;
    @Size(max = 100)
    @Column(name = "ITM_CODE")
    private String itmCode;
    @Size(max = 100)
    @Column(name = "ITG_CODE_L1")
    private String itgCodeL1;
    @Size(max = 100)
    @Column(name = "ITG_CODE_L2")
    private String itgCodeL2;
    @Size(max = 100)
    @Column(name = "ITG_CODE_L3")
    private String itgCodeL3;
    @Size(max = 100)
    @Column(name = "ITG_CODE_L4")
    private String itgCodeL4;
    @Size(max = 100)
    @Column(name = "ITG_CODE_L5")
    private String itgCodeL5;
    @Size(max = 100)
    @Column(name = "ITG_CODE_L6")
    private String itgCodeL6;
    @Size(max = 100)
    @Column(name = "ITT_CODE")
    private String ittCode;
    @Size(max = 100)
    @Column(name = "ITN_CODE")
    private String itnCode;
    @Size(max = 100)
    @Column(name = "IMO_CODE")
    private String imoCode;
    @Size(max = 100)
    @Column(name = "ITC_CODE")
    private String itcCode;
    @Size(max = 100)
    @Column(name = "ITS_CODE")
    private String itsCode;
    @Size(max = 100)
    @Column(name = "ITU_PURCHASE_CODE")
    private String ituPurchaseCode;
    @Size(max = 100)
    @Column(name = "ITU_STORED_CODE")
    private String ituStoredCode;
    @Size(max = 100)
    @Column(name = "ITU_SMALL_ISSUE_CODE")
    private String ituSmallIssueCode;
    @Size(max = 100)
    @Column(name = "ITU_MEDIUM_ISSUE_CODE")
    private String ituMediumIssueCode;
    @Size(max = 100)
    @Column(name = "ITU_LARGE_ISSUE_CODE")
    private String ituLargeIssueCode;
    @Size(max = 100)
    @Column(name = "ITM_NAME_L1")
    private String itmNameL1;
    @Size(max = 100)
    @Column(name = "ITM_NAME_L2")
    private String itmNameL2;
    @Size(max = 100)
    @Column(name = "ITM_SCIENTIFIC_NAME_L1")
    private String itmScientificNameL1;
    @Size(max = 100)
    @Column(name = "ITM_SCIENTIFIC_NAME_L2")
    private String itmScientificNameL2;
    @Size(max = 100)
    @Column(name = "ITM_DIN_NUM")
    private String itmDinNum;
    @Size(max = 100)
    @Column(name = "ITM_VOLUME")
    private String itmVolume;
    @Size(max = 100)
    @Column(name = "ITM_ALTERNATE_FLAG")
    private String itmAlternateFlag;
    @Size(max = 100)
    @Column(name = "ITM_REPLACEMENT_FLAG")
    private String itmReplacementFlag;
    @Size(max = 100)
    @Column(name = "ITM_EXPIRY_DATE_FLAG")
    private String itmExpiryDateFlag;
    @Size(max = 100)
    @Column(name = "ITM_INSPECTION_FLAG")
    private String itmInspectionFlag;
    @Size(max = 100)
    @Column(name = "ITM_PLANNING_FLAG")
    private String itmPlanningFlag;
    @Column(name = "ITM_PURCHASE_TAX_PERCENT")
    private Integer itmPurchaseTaxPercent;
    @Column(name = "ITM_SALES_TAX_PERCENT")
    private Integer itmSalesTaxPercent;
    @Column(name = "ITM_OTHER_TAX_PERCENT")
    private Integer itmOtherTaxPercent;
    @Size(max = 100)
    @Column(name = "ITM_CUSTOM_PERCENT")
    private String itmCustomPercent;
    @Size(max = 100)
    @Column(name = "ITM_LAST_PURCHAGE_UNIT_PRICE")
    private String itmLastPurchageUnitPrice;
    @Size(max = 100)
    @Column(name = "ITM_LAST_SALES_UNIT_PRICE")
    private String itmLastSalesUnitPrice;
    @Column(name = "ITM_AVR_COST")
    private Integer itmAvrCost;
    @Size(max = 100)
    @Column(name = "ITM_MAX_LEAD_TIME")
    private String itmMaxLeadTime;
    @Size(max = 100)
    @Column(name = "ITM_SHIPMENT_TIME")
    private String itmShipmentTime;
    @Size(max = 100)
    @Column(name = "ITM_OTHER_LEAD_TIME")
    private String itmOtherLeadTime;
    @Size(max = 100)
    @Column(name = "ITM_PASSWORD")
    private String itmPassword;
    @Column(name = "ITM_MAX_LIMIT")
    private Integer itmMaxLimit;
    @Size(max = 100)
    @Column(name = "ITM_MIN_LIMIT")
    private String itmMinLimit;
    @Size(max = 100)
    @Column(name = "ITM_SAFETY_STOCK")
    private String itmSafetyStock;
    @Column(name = "ITM_REORDER_POINT")
    private Integer itmReorderPoint;
    @Size(max = 100)
    @Column(name = "ITM_OPTIMUM_PURCHASE_QTY")
    private String itmOptimumPurchaseQty;
    @Size(max = 100)
    @Column(name = "ITM_AVR_CONSUMPTION_DAY")
    private String itmAvrConsumptionDay;
    @Size(max = 100)
    @Column(name = "ITM_AVR_CONSUMPTION_MONTH")
    private String itmAvrConsumptionMonth;
    @Size(max = 100)
    @Column(name = "ITM_AVR_CONSUMPTION_YEAR")
    private String itmAvrConsumptionYear;
    @Column(name = "ITM_ISSUE_FACTOR_LARGE_TO_MEDIUM")
    private Integer itmIssueFactorLargeToMedium;
    @Column(name = "ITM_ISSUE_FACTOR_MEDIUM_TO_SMALL")
    private Integer itmIssueFactorMediumToSmall;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ITM_DISCOUNT_1")
    private Double itmDiscount1;
    @Column(name = "ITM_DISCOUNT_2")
    private Integer itmDiscount2;
    @Size(max = 100)
    @Column(name = "ITM_DISCOUNT_3")
    private String itmDiscount3;
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
    @Column(name = "ITM_ISSUE_FACTOR_PUR_TO_SMALL")
    private Integer itmIssueFactorPurToSmall;
    @Size(max = 100)
    @Column(name = "SATUS_FLAG")
    private String satusFlag;
    @Size(max = 100)
    @Column(name = "CHRT_SERIAL")
    private String chrtSerial;
    @Size(max = 100)
    @Column(name = "ITM_GL_CODE")
    private String itmGlCode;
    @Size(max = 100)
    @Column(name = "ITM_TRANS_DONE")
    private String itmTransDone;
    @Size(max = 100)
    @Column(name = "IS_CODE")
    private String isCode;
    @Size(max = 100)
    @Column(name = "IG_CODE")
    private String igCode;
    @Size(max = 100)
    @Column(name = "IC_CODE")
    private String icCode;
    @Size(max = 100)
    @Column(name = "ITM_PURCHASE_TAX_PERC")
    private String itmPurchaseTaxPerc;
    @Column(name = "ITM_SALES_TAX_AMOUNT")
    private Integer itmSalesTaxAmount;
    @Size(max = 100)
    @Column(name = "itm_tax_value")
    private String itmTaxValue;
    @Column(name = "itm_count_cycle")
    private Integer itmCountCycle;
    @Size(max = 100)
    @Column(name = "cash_disc")
    private String cashDisc;
    @Size(max = 100)
    @Column(name = "itm_code1")
    private String itmCode1;
    @Size(max = 100)
    @Column(name = "itm_code2")
    private String itmCode2;
    @Size(max = 100)
    @Column(name = "itm_code3")
    private String itmCode3;
    @Size(max = 100)
    @Column(name = "itm_code4")
    private String itmCode4;
    @Size(max = 100)
    @Column(name = "itm_pic")
    private String itmPic;
    @Size(max = 100)
    @Column(name = "itm_cancel")
    private String itmCancel;
    @Size(max = 100)
    @Column(name = "itm_code5")
    private String itmCode5;
    @Size(max = 100)
    @Column(name = "itm_code6")
    private String itmCode6;
    @Size(max = 100)
    @Column(name = "itm_code7")
    private String itmCode7;
    @Size(max = 100)
    @Column(name = "itm_code8")
    private String itmCode8;
    @Size(max = 100)
    @Column(name = "itm_code9")
    private String itmCode9;
    @Size(max = 100)
    @Column(name = "itm_code10")
    private String itmCode10;
    @Size(max = 100)
    @Column(name = "itm_code11")
    private String itmCode11;
    @Size(max = 100)
    @Column(name = "itm_code12")
    private String itmCode12;
    @Size(max = 100)
    @Column(name = "itm_code13")
    private String itmCode13;
    @Size(max = 100)
    @Column(name = "itm_code14")
    private String itmCode14;
    @Size(max = 100)
    @Column(name = "itm_code15")
    private String itmCode15;
    @Size(max = 100)
    @Column(name = "itm_code16")
    private String itmCode16;
    @Size(max = 100)
    @Column(name = "itm_code17")
    private String itmCode17;
    @Size(max = 100)
    @Column(name = "itm_code18")
    private String itmCode18;
    @Size(max = 100)
    @Column(name = "itm_code19")
    private String itmCode19;
    @Size(max = 100)
    @Column(name = "itm_code20")
    private String itmCode20;
    @Size(max = 100)
    @Column(name = "itm_code21")
    private String itmCode21;
    @Size(max = 100)
    @Column(name = "itm_code22")
    private String itmCode22;
    @Size(max = 100)
    @Column(name = "itm_code23")
    private String itmCode23;
    @Size(max = 100)
    @Column(name = "itm_code24")
    private String itmCode24;
    @Size(max = 100)
    @Column(name = "itm_code25")
    private String itmCode25;
    @Size(max = 100)
    @Column(name = "itm_code26")
    private String itmCode26;
    @Size(max = 100)
    @Column(name = "itm_code27")
    private String itmCode27;
    @Size(max = 100)
    @Column(name = "itm_code28")
    private String itmCode28;
    @Size(max = 100)
    @Column(name = "itm_code29")
    private String itmCode29;
    @Size(max = 100)
    @Column(name = "itm_code30")
    private String itmCode30;
    @Size(max = 100)
    @Column(name = "added_profit")
    private String addedProfit;

    public ItemMaster() {
    }

    public ItemMaster(Integer itmSerial) {
        this.itmSerial = itmSerial;
    }

    public Integer getItmSerial() {
        return itmSerial;
    }

    public void setItmSerial(Integer itmSerial) {
        this.itmSerial = itmSerial;
    }

    public String getItmCode() {
        return itmCode;
    }

    public void setItmCode(String itmCode) {
        this.itmCode = itmCode;
    }

    public String getItgCodeL1() {
        return itgCodeL1;
    }

    public void setItgCodeL1(String itgCodeL1) {
        this.itgCodeL1 = itgCodeL1;
    }

    public String getItgCodeL2() {
        return itgCodeL2;
    }

    public void setItgCodeL2(String itgCodeL2) {
        this.itgCodeL2 = itgCodeL2;
    }

    public String getItgCodeL3() {
        return itgCodeL3;
    }

    public void setItgCodeL3(String itgCodeL3) {
        this.itgCodeL3 = itgCodeL3;
    }

    public String getItgCodeL4() {
        return itgCodeL4;
    }

    public void setItgCodeL4(String itgCodeL4) {
        this.itgCodeL4 = itgCodeL4;
    }

    public String getItgCodeL5() {
        return itgCodeL5;
    }

    public void setItgCodeL5(String itgCodeL5) {
        this.itgCodeL5 = itgCodeL5;
    }

    public String getItgCodeL6() {
        return itgCodeL6;
    }

    public void setItgCodeL6(String itgCodeL6) {
        this.itgCodeL6 = itgCodeL6;
    }

    public String getIttCode() {
        return ittCode;
    }

    public void setIttCode(String ittCode) {
        this.ittCode = ittCode;
    }

    public String getItnCode() {
        return itnCode;
    }

    public void setItnCode(String itnCode) {
        this.itnCode = itnCode;
    }

    public String getImoCode() {
        return imoCode;
    }

    public void setImoCode(String imoCode) {
        this.imoCode = imoCode;
    }

    public String getItcCode() {
        return itcCode;
    }

    public void setItcCode(String itcCode) {
        this.itcCode = itcCode;
    }

    public String getItsCode() {
        return itsCode;
    }

    public void setItsCode(String itsCode) {
        this.itsCode = itsCode;
    }

    public String getItuPurchaseCode() {
        return ituPurchaseCode;
    }

    public void setItuPurchaseCode(String ituPurchaseCode) {
        this.ituPurchaseCode = ituPurchaseCode;
    }

    public String getItuStoredCode() {
        return ituStoredCode;
    }

    public void setItuStoredCode(String ituStoredCode) {
        this.ituStoredCode = ituStoredCode;
    }

    public String getItuSmallIssueCode() {
        return ituSmallIssueCode;
    }

    public void setItuSmallIssueCode(String ituSmallIssueCode) {
        this.ituSmallIssueCode = ituSmallIssueCode;
    }

    public String getItuMediumIssueCode() {
        return ituMediumIssueCode;
    }

    public void setItuMediumIssueCode(String ituMediumIssueCode) {
        this.ituMediumIssueCode = ituMediumIssueCode;
    }

    public String getItuLargeIssueCode() {
        return ituLargeIssueCode;
    }

    public void setItuLargeIssueCode(String ituLargeIssueCode) {
        this.ituLargeIssueCode = ituLargeIssueCode;
    }

    public String getItmNameL1() {
        return itmNameL1;
    }

    public void setItmNameL1(String itmNameL1) {
        this.itmNameL1 = itmNameL1;
    }

    public String getItmNameL2() {
        return itmNameL2;
    }

    public void setItmNameL2(String itmNameL2) {
        this.itmNameL2 = itmNameL2;
    }

    public String getItmScientificNameL1() {
        return itmScientificNameL1;
    }

    public void setItmScientificNameL1(String itmScientificNameL1) {
        this.itmScientificNameL1 = itmScientificNameL1;
    }

    public String getItmScientificNameL2() {
        return itmScientificNameL2;
    }

    public void setItmScientificNameL2(String itmScientificNameL2) {
        this.itmScientificNameL2 = itmScientificNameL2;
    }

    public String getItmDinNum() {
        return itmDinNum;
    }

    public void setItmDinNum(String itmDinNum) {
        this.itmDinNum = itmDinNum;
    }

    public String getItmVolume() {
        return itmVolume;
    }

    public void setItmVolume(String itmVolume) {
        this.itmVolume = itmVolume;
    }

    public String getItmAlternateFlag() {
        return itmAlternateFlag;
    }

    public void setItmAlternateFlag(String itmAlternateFlag) {
        this.itmAlternateFlag = itmAlternateFlag;
    }

    public String getItmReplacementFlag() {
        return itmReplacementFlag;
    }

    public void setItmReplacementFlag(String itmReplacementFlag) {
        this.itmReplacementFlag = itmReplacementFlag;
    }

    public String getItmExpiryDateFlag() {
        return itmExpiryDateFlag;
    }

    public void setItmExpiryDateFlag(String itmExpiryDateFlag) {
        this.itmExpiryDateFlag = itmExpiryDateFlag;
    }

    public String getItmInspectionFlag() {
        return itmInspectionFlag;
    }

    public void setItmInspectionFlag(String itmInspectionFlag) {
        this.itmInspectionFlag = itmInspectionFlag;
    }

    public String getItmPlanningFlag() {
        return itmPlanningFlag;
    }

    public void setItmPlanningFlag(String itmPlanningFlag) {
        this.itmPlanningFlag = itmPlanningFlag;
    }

    public Integer getItmPurchaseTaxPercent() {
        return itmPurchaseTaxPercent;
    }

    public void setItmPurchaseTaxPercent(Integer itmPurchaseTaxPercent) {
        this.itmPurchaseTaxPercent = itmPurchaseTaxPercent;
    }

    public Integer getItmSalesTaxPercent() {
        return itmSalesTaxPercent;
    }

    public void setItmSalesTaxPercent(Integer itmSalesTaxPercent) {
        this.itmSalesTaxPercent = itmSalesTaxPercent;
    }

    public Integer getItmOtherTaxPercent() {
        return itmOtherTaxPercent;
    }

    public void setItmOtherTaxPercent(Integer itmOtherTaxPercent) {
        this.itmOtherTaxPercent = itmOtherTaxPercent;
    }

    public String getItmCustomPercent() {
        return itmCustomPercent;
    }

    public void setItmCustomPercent(String itmCustomPercent) {
        this.itmCustomPercent = itmCustomPercent;
    }

    public String getItmLastPurchageUnitPrice() {
        return itmLastPurchageUnitPrice;
    }

    public void setItmLastPurchageUnitPrice(String itmLastPurchageUnitPrice) {
        this.itmLastPurchageUnitPrice = itmLastPurchageUnitPrice;
    }

    public String getItmLastSalesUnitPrice() {
        return itmLastSalesUnitPrice;
    }

    public void setItmLastSalesUnitPrice(String itmLastSalesUnitPrice) {
        this.itmLastSalesUnitPrice = itmLastSalesUnitPrice;
    }

    public Integer getItmAvrCost() {
        return itmAvrCost;
    }

    public void setItmAvrCost(Integer itmAvrCost) {
        this.itmAvrCost = itmAvrCost;
    }

    public String getItmMaxLeadTime() {
        return itmMaxLeadTime;
    }

    public void setItmMaxLeadTime(String itmMaxLeadTime) {
        this.itmMaxLeadTime = itmMaxLeadTime;
    }

    public String getItmShipmentTime() {
        return itmShipmentTime;
    }

    public void setItmShipmentTime(String itmShipmentTime) {
        this.itmShipmentTime = itmShipmentTime;
    }

    public String getItmOtherLeadTime() {
        return itmOtherLeadTime;
    }

    public void setItmOtherLeadTime(String itmOtherLeadTime) {
        this.itmOtherLeadTime = itmOtherLeadTime;
    }

    public String getItmPassword() {
        return itmPassword;
    }

    public void setItmPassword(String itmPassword) {
        this.itmPassword = itmPassword;
    }

    public Integer getItmMaxLimit() {
        return itmMaxLimit;
    }

    public void setItmMaxLimit(Integer itmMaxLimit) {
        this.itmMaxLimit = itmMaxLimit;
    }

    public String getItmMinLimit() {
        return itmMinLimit;
    }

    public void setItmMinLimit(String itmMinLimit) {
        this.itmMinLimit = itmMinLimit;
    }

    public String getItmSafetyStock() {
        return itmSafetyStock;
    }

    public void setItmSafetyStock(String itmSafetyStock) {
        this.itmSafetyStock = itmSafetyStock;
    }

    public Integer getItmReorderPoint() {
        return itmReorderPoint;
    }

    public void setItmReorderPoint(Integer itmReorderPoint) {
        this.itmReorderPoint = itmReorderPoint;
    }

    public String getItmOptimumPurchaseQty() {
        return itmOptimumPurchaseQty;
    }

    public void setItmOptimumPurchaseQty(String itmOptimumPurchaseQty) {
        this.itmOptimumPurchaseQty = itmOptimumPurchaseQty;
    }

    public String getItmAvrConsumptionDay() {
        return itmAvrConsumptionDay;
    }

    public void setItmAvrConsumptionDay(String itmAvrConsumptionDay) {
        this.itmAvrConsumptionDay = itmAvrConsumptionDay;
    }

    public String getItmAvrConsumptionMonth() {
        return itmAvrConsumptionMonth;
    }

    public void setItmAvrConsumptionMonth(String itmAvrConsumptionMonth) {
        this.itmAvrConsumptionMonth = itmAvrConsumptionMonth;
    }

    public String getItmAvrConsumptionYear() {
        return itmAvrConsumptionYear;
    }

    public void setItmAvrConsumptionYear(String itmAvrConsumptionYear) {
        this.itmAvrConsumptionYear = itmAvrConsumptionYear;
    }

    public Integer getItmIssueFactorLargeToMedium() {
        return itmIssueFactorLargeToMedium;
    }

    public void setItmIssueFactorLargeToMedium(Integer itmIssueFactorLargeToMedium) {
        this.itmIssueFactorLargeToMedium = itmIssueFactorLargeToMedium;
    }

    public Integer getItmIssueFactorMediumToSmall() {
        return itmIssueFactorMediumToSmall;
    }

    public void setItmIssueFactorMediumToSmall(Integer itmIssueFactorMediumToSmall) {
        this.itmIssueFactorMediumToSmall = itmIssueFactorMediumToSmall;
    }

    public Double getItmDiscount1() {
        return itmDiscount1;
    }

    public void setItmDiscount1(Double itmDiscount1) {
        this.itmDiscount1 = itmDiscount1;
    }

    public Integer getItmDiscount2() {
        return itmDiscount2;
    }

    public void setItmDiscount2(Integer itmDiscount2) {
        this.itmDiscount2 = itmDiscount2;
    }

    public String getItmDiscount3() {
        return itmDiscount3;
    }

    public void setItmDiscount3(String itmDiscount3) {
        this.itmDiscount3 = itmDiscount3;
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

    public Integer getItmIssueFactorPurToSmall() {
        return itmIssueFactorPurToSmall;
    }

    public void setItmIssueFactorPurToSmall(Integer itmIssueFactorPurToSmall) {
        this.itmIssueFactorPurToSmall = itmIssueFactorPurToSmall;
    }

    public String getSatusFlag() {
        return satusFlag;
    }

    public void setSatusFlag(String satusFlag) {
        this.satusFlag = satusFlag;
    }

    public String getChrtSerial() {
        return chrtSerial;
    }

    public void setChrtSerial(String chrtSerial) {
        this.chrtSerial = chrtSerial;
    }

    public String getItmGlCode() {
        return itmGlCode;
    }

    public void setItmGlCode(String itmGlCode) {
        this.itmGlCode = itmGlCode;
    }

    public String getItmTransDone() {
        return itmTransDone;
    }

    public void setItmTransDone(String itmTransDone) {
        this.itmTransDone = itmTransDone;
    }

    public String getIsCode() {
        return isCode;
    }

    public void setIsCode(String isCode) {
        this.isCode = isCode;
    }

    public String getIgCode() {
        return igCode;
    }

    public void setIgCode(String igCode) {
        this.igCode = igCode;
    }

    public String getIcCode() {
        return icCode;
    }

    public void setIcCode(String icCode) {
        this.icCode = icCode;
    }

    public String getItmPurchaseTaxPerc() {
        return itmPurchaseTaxPerc;
    }

    public void setItmPurchaseTaxPerc(String itmPurchaseTaxPerc) {
        this.itmPurchaseTaxPerc = itmPurchaseTaxPerc;
    }

    public Integer getItmSalesTaxAmount() {
        return itmSalesTaxAmount;
    }

    public void setItmSalesTaxAmount(Integer itmSalesTaxAmount) {
        this.itmSalesTaxAmount = itmSalesTaxAmount;
    }

    public String getItmTaxValue() {
        return itmTaxValue;
    }

    public void setItmTaxValue(String itmTaxValue) {
        this.itmTaxValue = itmTaxValue;
    }

    public Integer getItmCountCycle() {
        return itmCountCycle;
    }

    public void setItmCountCycle(Integer itmCountCycle) {
        this.itmCountCycle = itmCountCycle;
    }

    public String getCashDisc() {
        return cashDisc;
    }

    public void setCashDisc(String cashDisc) {
        this.cashDisc = cashDisc;
    }

    public String getItmCode1() {
        return itmCode1;
    }

    public void setItmCode1(String itmCode1) {
        this.itmCode1 = itmCode1;
    }

    public String getItmCode2() {
        return itmCode2;
    }

    public void setItmCode2(String itmCode2) {
        this.itmCode2 = itmCode2;
    }

    public String getItmCode3() {
        return itmCode3;
    }

    public void setItmCode3(String itmCode3) {
        this.itmCode3 = itmCode3;
    }

    public String getItmCode4() {
        return itmCode4;
    }

    public void setItmCode4(String itmCode4) {
        this.itmCode4 = itmCode4;
    }

    public String getItmPic() {
        return itmPic;
    }

    public void setItmPic(String itmPic) {
        this.itmPic = itmPic;
    }

    public String getItmCancel() {
        return itmCancel;
    }

    public void setItmCancel(String itmCancel) {
        this.itmCancel = itmCancel;
    }

    public String getItmCode5() {
        return itmCode5;
    }

    public void setItmCode5(String itmCode5) {
        this.itmCode5 = itmCode5;
    }

    public String getItmCode6() {
        return itmCode6;
    }

    public void setItmCode6(String itmCode6) {
        this.itmCode6 = itmCode6;
    }

    public String getItmCode7() {
        return itmCode7;
    }

    public void setItmCode7(String itmCode7) {
        this.itmCode7 = itmCode7;
    }

    public String getItmCode8() {
        return itmCode8;
    }

    public void setItmCode8(String itmCode8) {
        this.itmCode8 = itmCode8;
    }

    public String getItmCode9() {
        return itmCode9;
    }

    public void setItmCode9(String itmCode9) {
        this.itmCode9 = itmCode9;
    }

    public String getItmCode10() {
        return itmCode10;
    }

    public void setItmCode10(String itmCode10) {
        this.itmCode10 = itmCode10;
    }

    public String getItmCode11() {
        return itmCode11;
    }

    public void setItmCode11(String itmCode11) {
        this.itmCode11 = itmCode11;
    }

    public String getItmCode12() {
        return itmCode12;
    }

    public void setItmCode12(String itmCode12) {
        this.itmCode12 = itmCode12;
    }

    public String getItmCode13() {
        return itmCode13;
    }

    public void setItmCode13(String itmCode13) {
        this.itmCode13 = itmCode13;
    }

    public String getItmCode14() {
        return itmCode14;
    }

    public void setItmCode14(String itmCode14) {
        this.itmCode14 = itmCode14;
    }

    public String getItmCode15() {
        return itmCode15;
    }

    public void setItmCode15(String itmCode15) {
        this.itmCode15 = itmCode15;
    }

    public String getItmCode16() {
        return itmCode16;
    }

    public void setItmCode16(String itmCode16) {
        this.itmCode16 = itmCode16;
    }

    public String getItmCode17() {
        return itmCode17;
    }

    public void setItmCode17(String itmCode17) {
        this.itmCode17 = itmCode17;
    }

    public String getItmCode18() {
        return itmCode18;
    }

    public void setItmCode18(String itmCode18) {
        this.itmCode18 = itmCode18;
    }

    public String getItmCode19() {
        return itmCode19;
    }

    public void setItmCode19(String itmCode19) {
        this.itmCode19 = itmCode19;
    }

    public String getItmCode20() {
        return itmCode20;
    }

    public void setItmCode20(String itmCode20) {
        this.itmCode20 = itmCode20;
    }

    public String getItmCode21() {
        return itmCode21;
    }

    public void setItmCode21(String itmCode21) {
        this.itmCode21 = itmCode21;
    }

    public String getItmCode22() {
        return itmCode22;
    }

    public void setItmCode22(String itmCode22) {
        this.itmCode22 = itmCode22;
    }

    public String getItmCode23() {
        return itmCode23;
    }

    public void setItmCode23(String itmCode23) {
        this.itmCode23 = itmCode23;
    }

    public String getItmCode24() {
        return itmCode24;
    }

    public void setItmCode24(String itmCode24) {
        this.itmCode24 = itmCode24;
    }

    public String getItmCode25() {
        return itmCode25;
    }

    public void setItmCode25(String itmCode25) {
        this.itmCode25 = itmCode25;
    }

    public String getItmCode26() {
        return itmCode26;
    }

    public void setItmCode26(String itmCode26) {
        this.itmCode26 = itmCode26;
    }

    public String getItmCode27() {
        return itmCode27;
    }

    public void setItmCode27(String itmCode27) {
        this.itmCode27 = itmCode27;
    }

    public String getItmCode28() {
        return itmCode28;
    }

    public void setItmCode28(String itmCode28) {
        this.itmCode28 = itmCode28;
    }

    public String getItmCode29() {
        return itmCode29;
    }

    public void setItmCode29(String itmCode29) {
        this.itmCode29 = itmCode29;
    }

    public String getItmCode30() {
        return itmCode30;
    }

    public void setItmCode30(String itmCode30) {
        this.itmCode30 = itmCode30;
    }

    public String getAddedProfit() {
        return addedProfit;
    }

    public void setAddedProfit(String addedProfit) {
        this.addedProfit = addedProfit;
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
        if (!(object instanceof ItemMaster)) {
            return false;
        }
        ItemMaster other = (ItemMaster) object;
        if ((this.itmSerial == null && other.itmSerial != null) || (this.itmSerial != null && !this.itmSerial.equals(other.itmSerial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.luv2code.springboot.cruddemo.entity.ItemMaster[ itmSerial=" + itmSerial + " ]";
    }
    
}
