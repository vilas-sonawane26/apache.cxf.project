package main;

import org.apache.cxf.frontend.ServerFactoryBean;

public class Server {

	public static void main(String[] args) {
		ServerFactoryBean sfBean = new ServerFactoryBean();
		sfBean.setServiceClass(TestWs.class);
		sfBean.setServiceBean(new TestWsService());
		sfBean.setAddress("http://localhost:5001/TestWs");
		sfBean.create();
		System.out.println("listening to port 5001");
	}
}
