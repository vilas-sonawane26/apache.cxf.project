package main;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

public class Client {

	public static void main(String[] args) {
		ClientProxyFactoryBean  client = new ClientProxyFactoryBean();
		client.setAddress("http://localhost:5001/TestWs");
		TestWs testws = client.create(TestWs.class);
		String msg = testws.getWelcomeMsg("Vilas");
		System.out.println(msg);
	}

}
