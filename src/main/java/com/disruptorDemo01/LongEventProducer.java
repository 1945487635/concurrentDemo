package com.disruptorDemo01;
//数据生产者

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;

public class LongEventProducer {
	private final RingBuffer<LongEvent> ringBuffer;
	public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
		// TODO Auto-generated constructor stub
		this.ringBuffer=ringBuffer;
	}
	public void onData(ByteBuffer bb) {
		long sequence=ringBuffer.next();
		try {
			LongEvent event=ringBuffer.get(sequence);
			event.setValue(bb.getLong(0));
		} finally {
			ringBuffer.publish(sequence);
		}
	}
}
