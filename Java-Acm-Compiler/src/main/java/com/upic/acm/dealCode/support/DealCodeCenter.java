package com.upic.acm.dealCode.support;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.upic.acm.System.HackSystem;
import com.upic.acm.dealCode.AbstraceDealCodeCenter;
import com.upic.acm.enums.CompilerEnum;
import com.upic.acm.result.DealResult;
import com.upic.classLoader.UpicClassLoader;

public class DealCodeCenter extends AbstraceDealCodeCenter {
	public DealCodeCenter(){
		super();
	}
	
	public DealCodeCenter(boolean newLine, CompilerEnum defaultCompile){
		super(newLine,defaultCompile);
	}

	@Override
	public DealResult dealByte(String resouece) {
		byte[] compile = (byte[]) codeCompiler.compile(resouece);
		if(compile==null){
			throw new NullPointerException("编译错误");
		}
		//替换代码 败笔（需要修改）
		byte[] compileReplace = (byte[]) replaceCode.replace(compile);
		//获得可以测试的类了
		Class<?> resultClass=doCompilerByByte(compileReplace);
		
		String test="1 2 3 4 5 6";
		String result="2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n";
//			Object newInstance = resultClass.newInstance();
			Method method;
			try {
				Field f=resultClass.getField("testData");
				f.set(String.class, test);
				method = resultClass.getMethod("main", new Class[] { String[].class });
				method.invoke(null, new String[] { null });
				System.out.println(HackSystem.getBufferString());
				System.out.println(HackSystem.getBufferString().equals(result));
			}  catch (Exception e) {
				e.printStackTrace();
			}
			
		return null;
	}

	private Class<?> doCompilerByByte(byte[] compileReplace) {
		return UpicClassLoader.getUpicClassLoader().loadByte(compileReplace);
	}

	@Override
	public DealResult dealClass(String resouece) {
		return null;
	}

}
