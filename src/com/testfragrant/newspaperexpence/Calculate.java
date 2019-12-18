package com.testfragrant.newspaperexpence;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Calculate
{
	public double getCurrentBill(List<String> newspapers) throws InstantiationException, IllegalAccessException, 
					ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		Double[] bill = new Double[newspapers.size()];
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		DateFormat df = new SimpleDateFormat("EEEE");
		
		for(String paper : newspapers)
		{
		Calendar orginalCal = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		while(dayOfWeek-- >1)
		{
		cal.add(Calendar.DAY_OF_WEEK, -1 );
		map.put(df.format(cal.getTime()), cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		}
		
		cal = orginalCal;
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		map.put(df.format(cal.getTime()), cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
        boolean isLastDay = cal.get(Calendar.DATE) == cal.getActualMaximum(Calendar.DATE) ? false:true;
       
		while(isLastDay && dayOfWeek <7)
		{
		cal.add(Calendar.DAY_OF_WEEK, 1 );
		dayOfWeek ++;
		
		if ((cal.get(Calendar.DATE) == cal.getActualMaximum(Calendar.DATE)))
		{
		break;
		}
		map.put(df.format(cal.getTime()), cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		}
		double total = 0.0;
		for (Entry<String, Integer> set :map.entrySet())
		{
			System.out.println(set.getKey() + " : " + set.getValue());
			
				Class<?> paperClass = Class.forName("com.testfragrant.newspaperexpence."+paper);
				
				Object paperObj = paperClass.newInstance(); // invoke empty constructor
				double value  = NewsPaper.getDay(paperObj, set.getKey().toUpperCase());
				System.out.println(paperClass.getName() + " " + set.getKey() + value + "==>" + set.getValue() * value);
                total = total + (set.getValue() * value);
		}
		bill[newspapers.indexOf(paper)] = total;
		}
		
		double totalBill = 0.0;
		for (double paperBill : bill)
		{
			totalBill = totalBill + paperBill;
		}
	
		return totalBill ;
	}
	
	public static void main(String args[])
	{
	Calculate cal = new Calculate();
	List papers = new ArrayList();
	papers.add("ET");
	papers.add("BM");
	
	try {
		System.out.println( "Bill amount -> " + cal.getCurrentBill(papers));
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException
			| SecurityException | IllegalArgumentException | InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
}
