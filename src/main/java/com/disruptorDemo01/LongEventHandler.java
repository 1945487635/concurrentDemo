package com.disruptorDemo01;

import com.lmax.disruptor.EventHandler;

//消费者(事件处理器)
public class LongEventHandler implements EventHandler<LongEvent>{

	@Override
	public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(longEvent.getValue());
	}

}
