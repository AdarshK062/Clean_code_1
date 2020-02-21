package Adarsh.Clean_code_1;

import java.io.PrintStream;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger LOGGER =LogManager.getLogger(App.class);
    public static void main( String[] args )throws IOException,SQLException
    {
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        Deposit deposit = new Deposit((double) 62000, 3, 7.0);
        Double simpleInterest = deposit.simpleInterest();
        Double compoundInterest = deposit.compoundInterest();
        LOGGER.info("Simple Interest is: " + simpleInterest);
        out.println("Simple Interest is: " + simpleInterest);
        LOGGER.info("Compound Interest is: " + compoundInterest);
        out.println("Compound Interest is: " + compoundInterest);    
        out.close();
    }
    	
}
