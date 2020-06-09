package com.novice.project.simple.registry.server.result;

import lombok.Data;

@Data
public class Message<T> {
	private int code; // 返回码
	private String description; // 描述
	private T result; // 返回信息

	public Message(MessageCode code) {
		this.code = code.getCode();
		this.description = code.getDescription();
	}

	public Message(MessageCode code, T result) {
		this.code = code.getCode();
		this.description = code.getDescription();
		this.result = result;
	}

	public Message(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public Message(int code, String description, T result) {
		this.code = code;
		this.description = description;
		this.result = result;
	}
}
