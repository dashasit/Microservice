package com.efi.inventory.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.efi.inventory.entity.Inventory;
import com.efi.inventory.entity.StockChange;
import com.efi.inventory.services.InventoryService;

@Controller
public class InventoryController {
	
	private static final Logger log = Logger.getLogger(InventoryController.class);

	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/getInventory")
	public ResponseEntity<List<StockChange>> getInventory(@RequestHeader String name) {
		
		log.debug("Get Inventory triggered for name : " + name);
		
		List<StockChange> inventory = null;
		try {
			inventory = inventoryService.getInventory(name);

			return new ResponseEntity<List<StockChange>>(inventory,
					HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Error in InventoryController.getInventory for name : " + name);
		}

		return new ResponseEntity<List<StockChange>>(inventory,
				HttpStatus.NOT_FOUND);
	}

	@PostMapping("/inventory/add")
	public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inv) {
		try {
			inventoryService.addInventory(inv);

			return new ResponseEntity<Inventory>(inv, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			
			log.debug("Error in InventoryController.addInventory");
		}
		return new ResponseEntity<Inventory>(HttpStatus.NOT_FOUND);
	}
}
