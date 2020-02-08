package com.ws.rpc;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import beans.Person;

@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloWorldService {
	
	@WebMethod
	public String getMessage();
	
	@WebMethod
	public Person getPerson(@WebParam(name="id") String id);

}
