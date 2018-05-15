package com.example.controller;

import java.net.URISyntaxException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;

import io.netty.handler.codec.http.QueryStringEncoder;

@RestController
public class ChaoXinController{
	
	//首先将本机域名映射到外网(ngrok)
	//在机器人管理界面配置本机url并配合nginx做url验证
	//https://bot.chaoxin.com/api
	@PostMapping("/")
	public void findAll(HttpServletRequest request,HttpServletResponse response,@RequestBody String msg)throws Exception{
		Msg m = JSON.parseObject(msg, Msg.class);
		System.out.println("接收到消息："+msg);
		
		//发送消息，并自定义键盘布局
		send(m.getChat_id(), m.getText());
	}
	
	public static void send(String groupId, String content) { 
		QueryStringEncoder encoder = new QueryStringEncoder(Common.SENDURL+Common.BOT_TOKEN);
		encoder.addParam("chat_id", groupId);
		encoder.addParam("chat_type", "0") ;
		encoder.addParam("text", content);
		encoder.addParam("reply_keyboard", getReplyKeyboard()) ;
		try {
			HttpClientUtil.get(encoder.toUri().toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	private static String getReplyKeyboard() {
		return "{\"resize_keyboard\":1,\"keyboard\":[[{\"type\":3,\"text\":\"确定\",\"content\":\"确定\",\"append_at\":1},{\"type\":3,\"text\":\"取消\",\"content\":\"取消\",\"hint\":\"取消\"}]]}";
	}
}
