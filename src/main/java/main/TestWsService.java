package main;

import javax.jws.WebService;

@WebService(endpointInterface = "main.TestWs")
public class TestWsService implements TestWs {

	public String getWelcomeMsg(String name) {
		return "Hi  " + name + "!!!!!!";
	}

}
