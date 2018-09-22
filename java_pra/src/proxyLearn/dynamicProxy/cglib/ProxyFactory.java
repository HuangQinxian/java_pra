package proxyLearn.dynamicProxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{

	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		//获取工具类
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(target.getClass());
		//设置回调函数
		enhancer.setCallback(this);
		//生成代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("拿起杯子");
		Object invoke = method.invoke(target, args);
		System.out.println("放下杯子");
		return invoke;
	}

}
