package com.wuliu.system.modules.message.handle.impl;

import com.wuliu.system.modules.message.handle.ISendMsgHandle;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsSendMsgHandle implements ISendMsgHandle {

	@Override
	public void SendMsg(String es_receiver, String es_title, String es_content) {
		// TODO Auto-generated method stub
		log.info("发短信");
	}

}
