package com.efi.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.efi.inventory.dao.InventoryDao;
import com.efi.inventory.entity.Inventory;
import com.efi.inventory.entity.StockChange;

@Component
public class InventoryService {

	@Autowired
	private InventoryDao inventoryDao;

	public Inventory getInventory() {
		return inventoryDao.getInventory();
	}

	/*
	 * public void addInventory(Inventory inv) { int maxModelBaseId =
	 * inventoryDao.getMaxModelBaseId();
	 * 
	 * inventoryDao.addModelBase(maxModelBaseId);
	 * 
	 * inv.setId(maxModelBaseId); inventoryDao.addInventory(inv); }
	 */

	public List<StockChange> getInventory(String name) {
		Inventory inv = inventoryDao.getInventoryByName(name);

		return inventoryDao.getStockChange(inv.getId());
	}

	public void addInventory(Inventory inv) {
		int maxModelBaseId = inventoryDao.getMaxModelBaseId();

		inventoryDao.addModelBase(maxModelBaseId);

		inv.setId(maxModelBaseId);
		inventoryDao.addInventory(inv);
	}
}
