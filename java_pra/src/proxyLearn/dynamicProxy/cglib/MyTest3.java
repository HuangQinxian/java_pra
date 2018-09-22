package proxyLearn.dynamicProxy.cglib;

import org.junit.Test;

/**
 * @author Huangqx
 * Cglib动态代理
 * 生成目标类的子类，因此目标类不能是final类型
 */
public class MyTest3 {
	
	@Test
	public void test1() {
		ProxyFactory proxyFactory = new ProxyFactory(new UserDaoImpl());
		UserDaoImpl proxyInstance = (UserDaoImpl) proxyFactory.getProxyInstance();
		proxyInstance.drink();
	}

}
