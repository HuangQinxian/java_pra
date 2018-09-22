package webService.service;

import javax.xml.ws.Endpoint;

public class WebServiceTest {
	public static void main(String[] args) {
		//发布地址一定要加上http
		String address = "http://127.0.0.1:9999/my/child01";
		//发布WebService服务
		Endpoint.publish(address, new ChildService01());
		System.out.println(address+"?WSDL");
	}
}
