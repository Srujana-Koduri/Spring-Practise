package com.dbs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_data")
public class CustomerData {
	
	@Id
	private String id;
	private String name;
	private int clear_balance;
	private boolean overdraft;
	
	@Override
	public String toString() {
		return "CustomerData [id=" + id + ", name=" + name + ", clear_balance=" + clear_balance + ", overdraft="
				+ overdraft + "]";
	}

	public CustomerData() {
		super();
	}

	public CustomerData(String id, String name, int clear_balance, boolean overdraft) {
		super();
		this.id = id;
		this.name = name;
		this.clear_balance = clear_balance;
		this.overdraft = overdraft;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClear_balance() {
		return clear_balance;
	}

	public void setClear_balance(int clear_balance) {
		this.clear_balance = clear_balance;
	}

	public boolean isOverdraft() {
		return overdraft;
	}

	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}
		
}
