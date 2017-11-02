package kali.freshdesk;

public class ApiName {
	public static final String token="BhPXCrDNWwuvbtxHo2p" + ":" + "X";
	public static final String endPoint="https://kpfsujeet1365.freshdesk.com";
	public static final String createTicket="/api/v2/tickets";
	public static final String allContact="/api/v2/contacts";
	public static final String contantTypeJson="";
	public static final String replyTicket(int ticketId){
		return "/api/v2/tickets/"+ticketId+"/reply";
	}
	
	public static final String ticketConversation(int ticketId){
		return "/api/v2/tickets/"+ticketId+"/conversations";
	}
	
	
}
