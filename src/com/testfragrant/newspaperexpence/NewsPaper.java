package com.testfragrant.newspaperexpence;

public abstract class NewsPaper {
	
	public static double getDay(Object newsPaper, String day)
	{
		if (newsPaper instanceof TOI)
		{
			return TOI.getDay(day);
			
		}else if (newsPaper instanceof HINDU)
		{
			return HINDU.getDay(day);
		}else if (newsPaper instanceof HT)
		{
		   return HT.getDay(day)	;
		}else if (newsPaper instanceof ET)
		{
			return ET.getDay(day);
		}
	    else if (newsPaper instanceof BM)
	    {
	    	return BM.getDay(day);
	    }
		
		return 0.0;
	}
}

 class TOI extends NewsPaper {
	
	public static double MONDAY = 3;
	public static double TUESDAY = 3;
	public static double WEDNESDAY = 3;
	public static double THURSDAY = 3;
	public static double FRIDAY = 3;
	public static double SATURDAY = 5;
	public static double SUNDAY = 6;
	
	public static double getDay(String day)
	{
		switch (day)
		{
		case "MONDAY" :
			return MONDAY;
			
		case "TUESDAY" :
			return TUESDAY;
			
		case "WEDNESDAY" :
			return WEDNESDAY;
			
		case "THURSDAY" :
			return THURSDAY;
			
		case "FRIDAY" :
			return FRIDAY;
			
		case "SATURDAY" :
			return SATURDAY;
			
		case "SUNDAY":
			return SUNDAY;
			
		default :
			return 0.0;
		}	
		
	}
}

class HINDU extends NewsPaper {
	
	public static double MONDAY = 2.5;
	public static double TUESDAY = 2.5;
	public static double WEDNESDAY = 2.5;
	public static double THURSDAY = 2.5;
	public static double FRIDAY = 2.5;
	public static double SATURDAY = 4;
	public static double SUNDAY = 4;
	
	public static double getDay(String day)
	{
		switch (day)
		{
		case "MONDAY" :
			return MONDAY;
			
		case "TUESDAY" :
			return TUESDAY;
			
		case "WEDNESDAY" :
			return WEDNESDAY;
			
		case "THURSDAY" :
			return THURSDAY;
			
		case "FRIDAY" :
			return FRIDAY;
			
		case "SATURDAY" :
			return SATURDAY;
			
		case "SUNDAY":
			return SUNDAY;
			
		default :
			return 0.0;
		}	
		
	}
}

class ET extends NewsPaper {
	
	public static double MONDAY = 2;
	public static double TUESDAY = 2;
	public static double WEDNESDAY = 2;
	public static double THURSDAY = 2;
	public static double FRIDAY = 2;
	public static double SATURDAY = 10;
	public static double SUNDAY = 10;
	
	ET(){
		
	}
	public static double getDay(String day)
	{
		switch (day)
		{
		case "MONDAY" :
			return MONDAY;
			
		case "TUESDAY" :
			return TUESDAY;
			
		case "WEDNESDAY" :
			return WEDNESDAY;
			
		case "THURSDAY" :
			return THURSDAY;
			
		case "FRIDAY" :
			return FRIDAY;
			
		case "SATURDAY" :
			return SATURDAY;
			
		case "SUNDAY":
			return SUNDAY;
			
		default :
			return 0.0;
		}	
		
	}
}

class BM extends NewsPaper {
	
	public static double MONDAY = 1.5;
	public static double TUESDAY = 1.5;
	public static double WEDNESDAY = 1.5;
	public static double THURSDAY = 1.5;
	public static double FRIDAY = 1.5;
	public static double SATURDAY = 1.5;
	public static double SUNDAY = 1.5;
	
	public static double getDay(String day)
	{
		switch (day)
		{
		case "MONDAY" :
			return MONDAY;
			
		case "TUESDAY" :
			return TUESDAY;
			
		case "WEDNESDAY" :
			return WEDNESDAY;
			
		case "THURSDAY" :
			return THURSDAY;
			
		case "FRIDAY" :
			return FRIDAY;
			
		case "SATURDAY" :
			return SATURDAY;
			
		case "SUNDAY":
			return SUNDAY;
			
		default :
			return 0.0;
		}	
		
	}
}


class HT extends NewsPaper {
	
	public static double MONDAY = 2;
	public static double TUESDAY = 2;
	public static double WEDNESDAY = 2;
	public static double THURSDAY = 2;
	public static double FRIDAY = 2;
	public static double SATURDAY = 2;
	public static double SUNDAY = 2;
	
	public static double getDay(String day)
	{
		switch (day)
		{
		case "MONDAY" :
			return MONDAY;
			
		case "TUESDAY" :
			return TUESDAY;
			
		case "WEDNESDAY" :
			return WEDNESDAY;
			
		case "THURSDAY" :
			return THURSDAY;
			
		case "FRIDAY" :
			return FRIDAY;
			
		case "SATURDAY" :
			return SATURDAY;
			
		case "SUNDAY":
			return SUNDAY;
			
		default :
			return 0.0;
		}	
		
	}
}

