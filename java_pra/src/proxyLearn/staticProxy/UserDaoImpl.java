package proxyLearn.staticProxy;

public class UserDaoImpl implements IUserDao{

	@Override
	public void save() {
		System.out.println("保存用户信息");
	}

}
