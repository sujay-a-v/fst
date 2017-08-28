package sujay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {
	
	public static String change(String str,String ptrn) {
        Pattern patt = Pattern.compile("<<name>>|<<full name>>|x{10}");
        Matcher m = patt.matcher(str);
        return m.replaceAll(ptrn);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String msg1="Hello <<name>>";
		String msg2="We have your full name as <<full name>> in our system.";
		String msg3="your contact number is 91-xxxxxxxxxx.";
		String msg4="Please,let us know in case of any clarification Thank you BridgeLabz ";
		
		System.out.println("enter the first name");
		String fname=scan.nextLine();
		msg1=change(msg1,fname);
	    System.out.println(msg1);
		
		System.out.println("enter the full name");
		String lname=scan.nextLine();
		msg2=change(msg2,lname);
	    System.out.println(msg2);
		
		System.out.println("enter the contact number");
		String num=scan.nextLine();
		if(num.matches("[0-9]{10}")==true)
	     {
			msg3=change(msg3,num);
		    System.out.println(msg3);
	     }
	     else
	     {
	         System.out.println("the number is not in a correct format. ");
	     }
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
	    
	    System.out.println("\n"+msg1+"  "+msg2+" "+msg3+" \n"+msg4+" "+sdf.format(date));

	}

}
