package basicPracticeTwo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date todaytime =new Date();
       System.out.println(todaytime);
       SimpleDateFormat yearly=new SimpleDateFormat("MM/dd/yyyy a X Z z H K u");
       System.out.println(yearly.format(todaytime));
       
	}

}
