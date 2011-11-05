package laixi;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class StaticInterceptor implements MethodInterceptor {

	private Class<?> targetClass;
	
	public StaticInterceptor(Class<?> targetClass){
		this.targetClass=targetClass;
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println(targetClass);
		return proxy.invoke(obj, args);
	}

}
