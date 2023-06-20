package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.model.Player;
import com.spring.service.PlayerService;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		// fill the code
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		PlayerService pObj=(PlayerService)ctx.getBean("playerService");
		System.out.println("Enter Player Name:");
		String playerName = in.nextLine();
		System.out.println("Enter the age");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Enter Marathon category");
		String category = in.nextLine();
		System.out.println("Enter Gender (Male/Female):");
		String gender = in.nextLine();
		System.out.println("Enter Player 10 digit Mobile Number:");
		String phoneNumber = in.nextLine();
		
		System.out.println("Amount to be paid is Rs: "+pObj.calculateEntryFees(playerName, gender, age, phoneNumber, category));
	}

}
