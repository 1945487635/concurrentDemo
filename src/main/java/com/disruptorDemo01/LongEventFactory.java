package com.disruptorDemo01;

import com.lmax.disruptor.EventFactory;

//2.创建事件
public class LongEventFactory implements EventFactory{

	@Override
	public Object newInstance() {
		// TODO Auto-generated method stub
		return new LongEvent();
	}

}
