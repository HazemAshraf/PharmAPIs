package com.pharmacy.pharmacy_API.dao;


import com.pharmacy.pharmacy_API.entity.ItemStoreCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterStoreRepo extends JpaRepository<ItemStoreCompany,Integer> {
//public ItemCompanyPrice findItemCompanyPriceByIcpRemarks(String icpRemarks);
    public ItemStoreCompany findItemStoreCompanyByItmSerial(int itmSerial);
	
}
