package com.example.crud.dto;

public class ErrorDto {

	private String msg;
	
	private String msgKey;

	public ErrorDto(String msg, String msgKey) {
		super();
		this.msg = msg;
		this.msgKey = msgKey;
	}

	public ErrorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsgKey() {
		return msgKey;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}
	
}
