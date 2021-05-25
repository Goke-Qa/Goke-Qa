package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class setUp {

	Controller controller;
	
	public setUp(Controller controller) {
		this.controller = controller;
	}
	
	@Before
	public void setup() {
		controller.setupController();
	}
	
	@After
	public void tearDown() {
		controller.teardownControllere();
	}
}
