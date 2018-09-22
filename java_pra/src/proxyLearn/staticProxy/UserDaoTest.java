package proxyLearn.staticProxy;

/**
 * @author Huangqx
 * 静态代理
 * 1. 代理类和目标类要实现同一个接口
 */
public class UserDaoTest {
	
	public void test1() {
		UserDaoImpl userDao = new UserDaoImpl();
		UserDaoProxy proxy = new UserDaoProxy(userDao);
		proxy.save();
	}
}
