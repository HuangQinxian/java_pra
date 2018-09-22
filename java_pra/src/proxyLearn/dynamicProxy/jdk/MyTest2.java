package proxyLearn.dynamicProxy.jdk;

/**
 * @author Huangqx
 * JDK动态代理：
 * 目标类必须实现一个接口
 */
public class MyTest2 {

	public static void test01() {
		ProxyFactory proxyFactory = new ProxyFactory(new UserDaoImpl());
		IUserDao userDao = (IUserDao)proxyFactory.getProxyInstance();
//		System.out.println(userDao.getClass());
		userDao.eat();
	}
	
	public static void main(String[] args) {
		test01();
	}
}
