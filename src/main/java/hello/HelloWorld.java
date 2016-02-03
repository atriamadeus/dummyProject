package hello;

public class HelloWorld {
	
	
     //private static final Logger                             LOG               = LoggerFactory.getLogger(HelloWorld.class);

	// Public class
	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		//LOG.info("Message" , greeter.sayHello());
	}
}