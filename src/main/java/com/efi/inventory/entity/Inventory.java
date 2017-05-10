package com.efi.inventory.entity;

public class Inventory {

	private int id;
	private String stockId;
	private int vendorId;
	private int onHand;
	private boolean isDeleted;
	private String stockGroup;
	private String name;
	private double thickness;
	private int available;
	private String uom;
	private boolean standardItem;
	private int colorId;
	private int stockGroupId;
	private int parentSizeId;
	private int stockUnit;
	private int stockTypeId;
	private double cost1;
	private double cost2;
	private double cost3;
	private double cost4;
	private double cost5;
	private double cost6;
	private int costunits;
	private double weight;
	private int qtybreak1;
	private int qtybreak2;
	private int qtybreak3;
	private int qtybreak4;
	private int qtybreak5;
	private int qtybreak6;
	

	public Inventory() {

	}

	public Inventory(int id, String name, String stockId, int vendorId,
			boolean isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.stockId = stockId;
		this.vendorId = vendorId;
		this.isDeleted = isDeleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public int getOnHand() {
		return onHand;
	}

	public void setOnHand(int onHand) {
		this.onHand = onHand;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getStockGroup() {
		return stockGroup;
	}

	public void setStockGroup(String stockGroup) {
		this.stockGroup = stockGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public boolean isStandardItem() {
		return standardItem;
	}

	public void setStandardItem(boolean standardItem) {
		this.standardItem = standardItem;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public int getStockGroupId() {
		return stockGroupId;
	}

	public void setStockGroupId(int stockGroupId) {
		this.stockGroupId = stockGroupId;
	}

	public int getParentSizeId() {
		return parentSizeId;
	}

	public void setParentSizeId(int parentSizeId) {
		this.parentSizeId = parentSizeId;
	}

	public int getStockUnit() {
		return stockUnit;
	}

	public void setStockUnit(int stockUnit) {
		this.stockUnit = stockUnit;
	}

	public int getStockTypeId() {
		return stockTypeId;
	}

	public void setStockTypeId(int stockTypeId) {
		this.stockTypeId = stockTypeId;
	}

	public double getCost1() {
		return cost1;
	}

	public void setCost1(double cost1) {
		this.cost1 = cost1;
	}

	public double getCost2() {
		return cost2;
	}

	public void setCost2(double cost2) {
		this.cost2 = cost2;
	}

	public double getCost3() {
		return cost3;
	}

	public void setCost3(double cost3) {
		this.cost3 = cost3;
	}

	public double getCost4() {
		return cost4;
	}

	public void setCost4(double cost4) {
		this.cost4 = cost4;
	}

	public double getCost5() {
		return cost5;
	}

	public void setCost5(double cost5) {
		this.cost5 = cost5;
	}

	public double getCost6() {
		return cost6;
	}

	public void setCost6(double cost6) {
		this.cost6 = cost6;
	}

	public int getCostunits() {
		return costunits;
	}

	public void setCostunits(int costunits) {
		this.costunits = costunits;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQtybreak1() {
		return qtybreak1;
	}

	public void setQtybreak1(int qtybreak1) {
		this.qtybreak1 = qtybreak1;
	}

	public int getQtybreak2() {
		return qtybreak2;
	}

	public void setQtybreak2(int qtybreak2) {
		this.qtybreak2 = qtybreak2;
	}

	public int getQtybreak3() {
		return qtybreak3;
	}

	public void setQtybreak3(int qtybreak3) {
		this.qtybreak3 = qtybreak3;
	}

	public int getQtybreak4() {
		return qtybreak4;
	}

	public void setQtybreak4(int qtybreak4) {
		this.qtybreak4 = qtybreak4;
	}

	public int getQtybreak5() {
		return qtybreak5;
	}

	public void setQtybreak5(int qtybreak5) {
		this.qtybreak5 = qtybreak5;
	}

	public int getQtybreak6() {
		return qtybreak6;
	}

	public void setQtybreak6(int qtybreak6) {
		this.qtybreak6 = qtybreak6;
	}

}
