package com.efi.inventory.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.efi.inventory.entity.Inventory;

public class InventoryRowMapper implements RowMapper<Inventory> {

	@Override
	public Inventory mapRow(ResultSet rs, int arg1) throws SQLException {
		Inventory inv = new Inventory();
		inv.setId(rs.getInt("id"));
		inv.setStockId(rs.getString("stockid"));
		inv.setVendorId(rs.getInt("vendor_id"));

		return inv;
	}
}
