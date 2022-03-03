package begin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	private static final Logger Log = LogManager.getLogger(Log4JDemo.class);
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Log.debug("This is my debug message");
    	Log.info("This is my info message");
    	Log.warn("This is my warn message");
    	Log.error("This is my error message");
    	Log.fatal("This is my fatal message");
		

	}

}
