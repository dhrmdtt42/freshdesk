package kali.freshdesk;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//System.out.println(CreateTicket.create());
       // System.out.println(ReplyTicket.reply(3, "sagasfga"));
    	System.out.println(Conversation.ticketConversation(3));
    }
}
