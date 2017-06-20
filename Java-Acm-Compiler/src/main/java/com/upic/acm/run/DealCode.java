package com.upic.acm.run;

import com.upic.acm.result.DealResult;

public interface DealCode {
	public enum DealEnum {

		BYTE,CLAZZ;
	}
	DealResult deal(String resource);
}
