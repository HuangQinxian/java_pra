package webService.service;

import javax.jws.WebService;

//wsimport解析后,包名都会变成小写
@WebService(endpointInterface="webService.service.ParentService")
public class ChildService01 implements ParentService{

	public  String getOne(String name) {
		return "Hello "+name+", I'm child01";
	}

}
