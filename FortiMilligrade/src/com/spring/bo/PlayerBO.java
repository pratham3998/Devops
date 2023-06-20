package com.spring.bo;

import org.springframework.stereotype.Component;

import com.spring.model.Player;

//use appropriate annotation
@Component
public class PlayerBO {

	/* This method should calculate the entry fees amount and return the same to the PlayerService class */
	
	public double calculateEntryFees (Player obj, String category) 
	{
		double amount=0.0;
		// fill the code
		
		String g = obj.getGender();
		Double p = 0.0;
		
		switch(category)
		{
		case "MiniMarathon" : p = 500.0;	break;
		case "HalfMarathon" : p = 1000.0;	break;
		case "Marathon" : p = 1500.0;	break;
		}
		
		if(g.equalsIgnoreCase("Female"))
		{
			amount = p - (p * 20)/100.00;
		}
		else
		{
			amount = p;
		}
		
		return amount;
	}

}
