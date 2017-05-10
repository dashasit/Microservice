package com.efi.inventory.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.efi.inventory.entity.StockChange;

public class StockChangeRowMapper implements RowMapper<StockChange> {

	@Override
	public StockChange mapRow(ResultSet rs, int arg1) throws SQLException {
		StockChange sc = new StockChange();
		sc.setId(rs.getInt("id"));
		sc.setStockDefinitionId(rs.getInt("stockdefinition_id"));
		sc.setUsername(rs.getString("username"));
		sc.setCommited(rs.getBoolean("commited"));
		sc.setDeleted(rs.getBoolean("isdeleted"));
		sc.setHowChanged(rs.getString("howchanged"));
		sc.setInvoiceId(rs.getInt("invoiceid"));
		sc.setJobId(rs.getInt("jobid"));
		sc.setQuantity(rs.getInt("quantity"));
		sc.setReference(rs.getString("reference"));
		sc.setStockChangeDate(rs.getTimestamp("stockchangedate"));
		sc.setStockChangeId(rs.getInt("stockchangeid"));

		return sc;
	}
}
