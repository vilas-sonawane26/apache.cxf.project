package com.ws.rpc;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import beans.Person;

@WebService(endpointInterface = "com.ws.rpc.HelloWorldService", name = "HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@WebMethod
	public String getMessage() {
		return "message";
	}
	
	@WebMethod
	public Person getPerson(@WebParam(name="id") String id) {
		Person p = new Person();
		p.setId(id);
		p.setName("VILAS");
		p.setAge("35");
		p.setAddress("KALYAN");
		return p;
	}

}
