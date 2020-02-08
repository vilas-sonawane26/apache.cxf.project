package com.ws;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import beans.Person;

@WebService
public interface HelloWorldService {
	
	@WebMethod
	public String getMessage();
	
	@WebMethod
	public Person getPerson(@WebParam(name="id") String id);

}
