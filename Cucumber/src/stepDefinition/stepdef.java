package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class stepdef {

	@Given("^ONE$")
	public void one() throws Throwable {
	    System.out.println("ONE");
	}

	@Given("^TWO$")
	public void two() throws Throwable {
		System.out.println("TWO");
	}

	@Given("^THREE$")
	public void three() throws Throwable {
		System.out.println("THREE");
	}

	@Given("^FOUR$")
	public void four() throws Throwable {
		System.out.println("FOUR");
	}

	@Given("^FIVE$")
	public void five() throws Throwable {
		System.out.println("FIVE");
	}

	@Given("^SIX$")
	public void six() throws Throwable {
		System.out.println("SIX");
	}

	@Given("^SEVEN$")
	public void seven() throws Throwable {
		System.out.println("SEVEN");
	}

	@Given("^EIGHT$")
	public void eight() throws Throwable {
		System.out.println("EIGHT");
	}

	@Given("^NINE$")
	public void nine() throws Throwable {
		System.out.println("NINE");
	}

	@Given("^TEN$")
	public void ten() throws Throwable {
		System.out.println("TEN");
	}

	@Given("^ELEVEN CC Card$")
	public void eleven_CC_Card() throws Throwable {
		System.out.println("ELEVEN-CC Card");
	}

	@Given("^ELEVEN DD Card$")
	public void eleven_DD_Card() throws Throwable {
		System.out.println("ELEVEN-DD Card");
	}

	
}
