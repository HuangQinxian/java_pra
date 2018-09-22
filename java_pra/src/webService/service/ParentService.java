package webService.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ParentService {
	
	@WebMethod(operationName="getOneMethod")
	@WebResult(name="result") String getOne(@WebParam(name="name")String name);
}
