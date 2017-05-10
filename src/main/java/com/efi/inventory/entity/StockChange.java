package com.efi.inventory.entity;

import java.sql.Timestamp;

public class StockChange {
	private int id;
	private int stockDefinitionId;
	private String username;
	private int stockChangeId;
	private Timestamp stockChangeDate;
	private String reference;
	private int quantity;
	private int jobId;
	private boolean isDeleted;
	private int invoiceId;
	private String howChanged;
	private boolean commited;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStockDefinitionId() {
		return stockDefinitionId;
	}

	public void setStockDefinitionId(int stockDefinitionId) {
		this.stockDefinitionId = stockDefinitionId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getStockChangeId() {
		return stockChangeId;
	}

	public void setStockChangeId(int stockChangeId) {
		this.stockChangeId = stockChangeId;
	}

	public Timestamp getStockChangeDate() {
		return stockChangeDate;
	}

	public void setStockChangeDate(Timestamp stockChangeDate) {
		this.stockChangeDate = stockChangeDate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getHowChanged() {
		return howChanged;
	}

	public void setHowChanged(String howChanged) {
		this.howChanged = howChanged;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

}
