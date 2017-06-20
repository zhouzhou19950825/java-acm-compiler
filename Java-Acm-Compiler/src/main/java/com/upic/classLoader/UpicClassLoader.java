package com.upic.classLoader;

/**
 * @author DTZ
 */
public class UpicClassLoader extends ClassLoader {
	private static UpicClassLoader loader;
	private static final Object OBJ=new Object();
	
	public static UpicClassLoader getUpicClassLoader(){
		if(loader==null){
			synchronized (OBJ) {
				if(loader==null){
					loader=new UpicClassLoader();
				}
			}
		}
		return loader;
	}
	private UpicClassLoader() {
		super(UpicClassLoader.class.getClassLoader());
	}

	public Class<?> loadByte(byte[] classByte) {
		return defineClass(null, classByte, 0, classByte.length);
	}
	
}
