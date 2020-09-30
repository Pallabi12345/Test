package com.mymaven.demo;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("hello again");
        
        Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		boolean b=DateUtils.isSameDay(c1, c2);
		if(b==true)
			System.out.println("equal date ");
		else
			System.out.println("not equal date");
		Date d1=new Date(562312L);
		Date d2=new Date(121123456L);
		b=DateUtils.isSameDay(d1, d2);
		if(b==true)
			System.out.println("same date");
		else
			System.out.println("not same");
		

        
    }
}
