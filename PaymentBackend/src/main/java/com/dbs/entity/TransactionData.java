package com.dbs.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;
	private String sender_id;
	private String sender_name;
	private String receiver_id;
	private String receiver_name;
	private String receiver_bic;
	private String transfer_type;
	private int amount;
	private String message_code;
	
	@Override
	public String toString() {
		return "TransactionData [date=" + date + ", sender_id=" + sender_id + ", sender_name=" + sender_name
				+ ", receiver_id=" + receiver_id + ", receiver_name=" + receiver_name + ", receiver_bic=" + receiver_bic
				+ ", transfer_type=" + transfer_type + ", amount=" + amount + ", message_code=" + message_code + "]";
	}
	public TransactionData() {
		super();
	}
	public TransactionData(Date date, String sender_id, String sender_name, String receiver_id, String receiver_name,
			String receiver_bic, String transfer_type, int amount, String message_code) {
		super();
		this.date = date;
		this.sender_id = sender_id;
		this.sender_name = sender_name;
		this.receiver_id = receiver_id;
		this.receiver_name = receiver_name;
		this.receiver_bic = receiver_bic;
		this.transfer_type = transfer_type;
		this.amount = amount;
		this.message_code = message_code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSender_id() {
		return sender_id;
	}
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_bic() {
		return receiver_bic;
	}
	public void setReceiver_bic(String receiver_bic) {
		this.receiver_bic = receiver_bic;
	}
	public String getTransfer_type() {
		return transfer_type;
	}
	public void setTransfer_type(String transfer_type) {
		this.transfer_type = transfer_type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMessage_code() {
		return message_code;
	}
	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}
	
}
