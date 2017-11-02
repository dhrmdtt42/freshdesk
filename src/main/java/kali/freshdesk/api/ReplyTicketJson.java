package kali.freshdesk.api;

public class ReplyTicketJson {
	private String body;
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString(){
		return "{\"body\":\""+getBody()
				 +"\"}";
	}
	
}
