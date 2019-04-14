package logging;
import org.apache.log4j.Logger;


public class LoggingDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggingDemo.class);
		logger.debug("Main Code Starts ");
		// Some Logic Going On
		try{
		System.out.println("here");
			int e = 109/0;
		logger.debug("Main Code Ends");
		System.out.println("here");
		}
		
		catch(ArithmeticException e){
			logger.error("Exception in Main "+e);
		}
	}

}
