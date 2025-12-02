package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Javautility {
	



	public int getrandomnumber()
	{
		Random random=new Random();
		int randomnumber = random.nextInt(5000);
		return randomnumber;
		
	}
	
	
	public String getsystemdate()
	{
	Date dateobj=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	String date = sdf.format(dateobj);
	return date;
	
	}
	
	
	public String getrequireddate(int days)
	{
		Date dateobj1=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		sim.format(dateobj1);
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqdate = sim.format(cal.getTime());
		return reqdate;
	
 		
		
	}
	
	
	
	
	
	
	

}
