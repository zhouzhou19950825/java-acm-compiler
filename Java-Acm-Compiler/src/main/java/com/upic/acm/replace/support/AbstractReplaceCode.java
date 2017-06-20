package com.upic.acm.replace.support;

import com.upic.acm.replace.ReplaceCode;
import com.upic.acm.run.DealCode.DealEnum;

public abstract class AbstractReplaceCode implements ReplaceCode {
	private DealEnum compilerEnum;
	
	public AbstractReplaceCode(DealEnum compilerEnum){
		this.compilerEnum=compilerEnum;
	}
	@Override
	public Object replace(byte[] clazz) {
		return compilerEnum==DealEnum.BYTE?replaceByte(clazz):replaceClass(clazz);
	}
	public abstract byte[] replaceByte(byte[] code);

	public abstract Class<?> replaceClass(byte[] code);
}
