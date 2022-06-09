package com.question_2;

public class Ticket {
	
	private int ticketId;
	
	private int price;
	
	private static int availableTickets;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		
		if(availableTickets>0) {
			
			Ticket.availableTickets = availableTickets;
			
		}
		
		else {
			
			System.out.println("enter a valid number");
			
		}
		
	}
	
	public int calculateTicketCost(int nooftickets) {
		
		
		
		if(getAvailableTickets()>0) {
			
			setAvailableTickets(getAvailableTickets()-nooftickets);
			
			return nooftickets*getPrice();
			
		}
		
		return -1;
		
	}

	

	
	
	

}
