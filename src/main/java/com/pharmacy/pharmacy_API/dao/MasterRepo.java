package com.pharmacy.pharmacy_API.dao;


import com.pharmacy.pharmacy_API.entity.ItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterRepo extends JpaRepository<ItemMaster,Integer> {

    //public ItemCompanyPrice findItemCompanyPriceByIcpRemarks(String icpRemarks);
    public ItemMaster findItemMasterByItmNameL1(String itmNameL1);
    public List<ItemMaster> findItemMasterByItmNameL1StartingWith(String itmNameL1);
   // public ItemMaster save(ItemMaster itemMaster);
	
}
