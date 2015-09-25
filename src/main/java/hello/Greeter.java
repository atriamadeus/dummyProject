package hello;

import org.joda.time.DateTime;

public class Greeter {

	private DateTime currentTime = new DateTime();
	
	public String sayHello() {

		String result = "Hello World";
		result += " @ " + getGreeterTime();
		return result;
	}
	

	public DateTime getGreeterTime() {

		return this.currentTime;
	}

}