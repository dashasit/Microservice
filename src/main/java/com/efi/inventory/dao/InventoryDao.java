package com.efi.inventory.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.efi.inventory.entity.Inventory;
import com.efi.inventory.entity.StockChange;
import com.efi.inventory.rowmapper.InventoryRowMapper;
import com.efi.inventory.rowmapper.StockChangeRowMapper;

@Repository
public class InventoryDao extends JdbcDaoSupport {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	private void initialize() {
		setJdbcTemplate(jdbcTemplate);
	}

	public Inventory getInventory() {
		String query = "select id,stockid,vendor_id from stockdefinition where name=?";

		Object[] inputs = new Object[] { 4275 };

		Inventory inv = jdbcTemplate.queryForObject(query, inputs,
				new InventoryRowMapper());

		return inv;
	}
	
	public Inventory getInventoryByName(String name) {
		String query = "select id,stockid,vendor_id from stockdefinition where name=?";

		Object[] inputs = new Object[] { name };

		Inventory inv = jdbcTemplate.queryForObject(query, inputs,
				new InventoryRowMapper());

		return inv;
	}

	public List<StockChange> getStockChange(int stockDefId) {
		String query = "select id,stockchangeid, commited, howchanged, invoiceid, isdeleted, jobid, quantity, reference, "
				+ "stockchangedate, username, stockdefinition_id from stockchange where stockdefinition_id=?";

		Object[] inputs = new Object[] { stockDefId };

		List<StockChange> stockChangeList = jdbcTemplate.query(query, inputs,
				new StockChangeRowMapper());

		return stockChangeList;
	}

	public int getMaxModelBaseId() {
		String query = "select nextval('modelbase_id_seq')";
		Integer maxId = (Integer) jdbcTemplate.queryForObject(query,
				Integer.class);

		return maxId.intValue();
	}

	@Transactional
	public int addModelBase(int id) {
		String insert = "insert into modelbase(id, created, isdeleted, modified) values(?,?,?,?)";

		return jdbcTemplate.update(insert, id,
				new Timestamp(new Date().getTime()), false, new Timestamp(
						new Date().getTime()));
	}

	@Transactional
	public int addInventory(Inventory inv) {
		String insert = "insert into stockdefinition(id, name, stockid, vendor_id, isdeleted, thickness, onhand, available, uom, "
				+ "standarditem, stkgroup_id, color_id, parentsize_id, stockunit, stktype_id, cost1, cost2, cost3, cost4, cost5, cost6, "
				+ "costunits, weight, qtybreak1, qtybreak2, qtybreak3, qtybreak4, qtybreak5, qtybreak6) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		return jdbcTemplate.update(insert, inv.getId(), inv.getName(),
				inv.getStockId(), inv.getVendorId(), inv.isDeleted(),
				inv.getThickness(), inv.getOnHand(), inv.getAvailable(),
				inv.getUom(), inv.isStandardItem(), inv.getStockGroupId(),
				inv.getColorId(), inv.getParentSizeId(), inv.getStockUnit(),
				inv.getStockTypeId(), inv.getCost1(), inv.getCost2(),
				inv.getCost3(), inv.getCost4(), inv.getCost5(), inv.getCost6(),
				inv.getCostunits(), inv.getWeight(), inv.getQtybreak1(),
				inv.getQtybreak2(), inv.getQtybreak3(), inv.getQtybreak4(),
				inv.getQtybreak5(), inv.getQtybreak6());
	}
}
