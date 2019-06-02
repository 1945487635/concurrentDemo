package com.disruptorDemo01;

import java.nio.ByteBuffer;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

public class LongEventProducerWithTranslator {
	private static final EventTranslatorOneArg<LongEvent, ByteBuffer> TRANSLATOR=new EventTranslatorOneArg<LongEvent, ByteBuffer>() {

		@Override
		public void translateTo(LongEvent longEvent, long l, ByteBuffer bb) {
			// TODO Auto-generated method stub
			System.out.println(bb.getLong());
		}
	};
	private final RingBuffer<LongEvent> ringBuffer;
	public LongEventProducerWithTranslator(RingBuffer<LongEvent> ringBuffer) {
		this.ringBuffer=ringBuffer;
	}
	public void onData(ByteBuffer bb) {
		ringBuffer.publishEvent(TRANSLATOR,bb);
	}
}
