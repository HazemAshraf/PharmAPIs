package com.pharmacy.pharmacy_API.dao;


import com.pharmacy.pharmacy_API.entity.ItemCompanyPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterPriceRepo extends JpaRepository<ItemCompanyPrice,Double> {
//public ItemCompanyPrice findItemCompanyPriceByIcpRemarks(String icpRemarks);
    public ItemCompanyPrice findItemCompanyPriceByItmSerial(double itmSerial);
	
}
