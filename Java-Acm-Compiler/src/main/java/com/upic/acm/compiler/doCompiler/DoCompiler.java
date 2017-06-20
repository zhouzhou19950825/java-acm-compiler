package com.upic.acm.compiler.doCompiler;

import com.upic.acm.compiler.support.AbsractCodeCompiler;
import com.upic.acm.run.DealCode.DealEnum;
import com.upic.acm.utils.UpicJdkCompiler;

public class DoCompiler extends AbsractCodeCompiler{

	private UpicJdkCompiler upicJdkCompiler;
	
	private String className;

//	public DoCompiler(CompilerEnum compilerEnum) {
//		super(compilerEnum);
//	}
	public DoCompiler(UpicJdkCompiler upicJdkCompiler,String className,DealEnum compilerEnum) {
		
		this.upicJdkCompiler=upicJdkCompiler;
		this.className=className;
	}
	

	@Override
	public Class<?> returnClass(String resource)  {
		try {
			return (Class<?>) upicJdkCompiler.doCompile(className, resource, compilerEnum);
		} catch (Throwable e) {
			return null;
		}
	}

	@Override
	public byte[] returnByte(String resource) {
		try {
			return (byte[]) upicJdkCompiler.doCompile(className, resource, compilerEnum);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

}
