package com.xworkz.internal;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("YearVal", "SizeVal", "MaterialVal");
        System.out.println(ticket);

        Ticket ticket1 = new Ticket("YearVal", "SizeVal", "MaterialVal");
        int ref = ticket1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
