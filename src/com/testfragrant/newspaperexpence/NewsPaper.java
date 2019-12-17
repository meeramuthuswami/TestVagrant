package com.testfragrant.newspaperexpence;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public interface NewsPaper {
	
}

class Calculate
{
	public static void main(String main[])
	{
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		Calendar orginalCal = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		while(dayOfWeek-- >1)
		{
		cal.add(Calendar.DAY_OF_WEEK, -1 );
		System.out.print(cal.getTime());
		
		System.out.println("-->" + cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		map.put(cal.get(Calendar.DAY_OF_WEEK), cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		}
		cal = orginalCal;
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.print(cal.getTime());
		System.out.println("-->" + cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		map.put(cal.get(Calendar.DAY_OF_WEEK), cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
        boolean isLastDay = cal.get(Calendar.DATE) == cal.getActualMaximum(Calendar.DATE) ? false:true;
       
		while(isLastDay && dayOfWeek <7)
		{
		cal.add(Calendar.DAY_OF_WEEK, 1 );
		System.out.print(cal.getTime());
		
		System.out.println("-->" + cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		dayOfWeek ++;
		
		if ((cal.get(Calendar.DATE) == cal.getActualMaximum(Calendar.DATE)))
		{
		break;
		}
		map.put(cal.get(Calendar.DAY_OF_WEEK), cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		}
		
		for (Entry<Integer, Integer> set :map.entrySet())
		{
			System.out.println(set.getKey() + " : " + set.getValue());
		}
	}
	
	
}

enum TOI implements NewsPaper {
	MONDAY(3), TUESDAY(3), WEDNESDAY(3), THURSDAY(3), FRIDAY(3), SATURDAY(5), SUNDAY(6);

	TOI(double val) {

	}

}

enum HINDU implements NewsPaper {
	MONDAY(2.5), TUESDAY(2.5), WEDNESDAY(2.5), THURSDAY(2.5), FRIDAY(2.5), SATURDAY(4), SUNDAY(4);

	HINDU(double val) {

	}

}

enum ET implements NewsPaper {
	MONDAY(2), TUESDAY(2), WEDNESDAY(2), THURSDAY(2), FRIDAY(2), SATURDAY(10), SUNDAY(10);

	ET(double val) {

	}

}

enum BM implements NewsPaper {
	MONDAY(1.5), TUESDAY(1.5), WEDNESDAY(1.5), THURSDAY(1.5), FRIDAY(1.5), SATURDAY(1.5), SUNDAY(1.5);

	BM(double val) {

	}

}

enum HT implements NewsPaper {
	MONDAY(2), TUESDAY(2), WEDNESDAY(2), THURSDAY(2), FRIDAY(2), SATURDAY(4), SUNDAY(4);

	HT(double val) {

	}

}
