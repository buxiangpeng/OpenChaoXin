package com.example.controller;

import java.util.List;

public class Msg {
	
	//请求的类型，这里为1，表示为聊天消息请求
	private String request_type;		
	
	//消息的唯一性ID
	private String uuid;	
	
	//发出这条消息的用户ID
	private String user_id;	
	
	//对话的类型，0为群聊对话，1为私聊对话
	private String chat_type;		
	
	//对话的ID，根据chat_type分为唯一的群ID或者用户ID
	private String chat_id;		
	
	//消息发送时间
	private String message_time;	
	
	//聊天消息类型
	private String message_type;	
	
	//entity对象的数组，修饰文字消息的文字链接或者@内容
	private String entities;	 
	
	//用户名
	private String nickname;
	
	//发送内容
	private String text;

	public String getRequest_type() {
		return request_type;
	}

	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getChat_type() {
		return chat_type;
	}

	public void setChat_type(String chat_type) {
		this.chat_type = chat_type;
	}

	public String getChat_id() {
		return chat_id;
	}

	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}

	public String getMessage_time() {
		return message_time;
	}

	public void setMessage_time(String message_time) {
		this.message_time = message_time;
	}

	public String getMessage_type() {
		return message_type;
	}

	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}

	public String getEntities() {
		return entities;
	}

	public void setEntities(String entities) {
		this.entities = entities;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	
}
