package com.question_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of bookings");
		
		int bookings = sc.nextInt();
		
		System.out.println("enter available tickets");
		
		int availableTickets = sc.nextInt();
		
		Ticket ticket = new Ticket();
		
		ticket.setAvailableTickets(availableTickets);
		
		
		for(int i = 0; i<bookings; i++) {
			
			System.out.println("enter ticket id");
			
			int ticketId = sc.nextInt();
			
			System.out.println("enter the price of each ticket:");
			
			int price = sc.nextInt();
			
			ticket.setPrice(price);
			
			System.out.println("enter no. of tickets");
			
			int noOfTickets = sc.nextInt();
			
			int totalCost = ticket.calculateTicketCost(noOfTickets);
			
			System.out.println("Total amount: "+totalCost);
			
			System.out.println("Available tickets after booking: "+ticket.getAvailableTickets());
			
		}
	}

}
