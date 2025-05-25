package za.ac.cput.Factory.payment;

import za.ac.cput.Domain.payment.Ticket;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;

public class TicketFactory {

    public static Ticket createTicket(double ticketAmount, LocalDate issueDate, String status){

        if(Helper.isNullOrEmpty(String.valueOf(ticketAmount)) || Helper.isNullOrEmpty(String.valueOf(issueDate)) || Helper.isNullOrEmpty(status)){
            return null;
        }

        int ticketId = Helper.generateUniqueId();

        return new Ticket.Builder()
                .setTicketId(ticketId)
                .setAmount(ticketAmount)
                .setIssueDate(issueDate)
                .setStatus(status)
                .build();
    }

}
