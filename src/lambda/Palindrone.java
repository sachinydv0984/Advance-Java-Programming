package lambda;

import java.util.ArrayList;
import java.util.HashMap;

@FunctionalInterface
interface PString{
	boolean checkPalin(String info);
}

public class Palindrone {
 
	public static void main(String[] args) {
		
//		ArrayList<String> list =new ArrayList<>();
//		HashMap<Integer,String> map=new HashMap<>();
//		int number =20; 
//	        OR
		// TODO Auto-generated method stub
//		var list = new ArrayList<Integer>();                   generic type
//		var map = new HashMap<Integer,String>();
//		var number =20;
//		
             PString ps=(String info)->{
            	 return new StringBuilder(info).reverse().toString().equals(info);
            		
             };
            	 
             if(ps.checkPalin("AcA")) {
            	 System.out.println("Paliindrome");
             }else {
            	 System.out.println("Not a Palindrone");
             }
             }
}
