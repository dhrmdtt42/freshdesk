package kali.freshdesk.api;

import java.util.ArrayList;

public class CreateTicketApi {
	
	public CreateTicketApi(){
		this.priority=1;
		this.status=2;
	}
		
		private String description;
		private String subject;
		private String email;
		private int priority=1;
		private int status=2;
		private String name;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		private ArrayList<String> cc_emails;
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getPriority() {
			return priority;
		}
		public void setPriority(int priority) {
			this.priority = priority;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public ArrayList<String> getCc_emails() {
			return cc_emails;
		}
		public void setCc_emails(ArrayList<String> cc_emails) {
			this.cc_emails = cc_emails;
		}
		
		
		@Override
		public String toString(){
			
			return "{\"description\":\""+getDescription()+"\","
					+ "\"subject\":\""+getSubject() +"\","
					+ "\"name\":\""+getName() +"\","
					+"\"email\":\"" +getEmail()+"\","
					+"\"priority\":"+getPriority()+","
					+ "\"status\":"+getStatus()+","
					+ "\"cc_emails\":"+"[]}";
		
		}
		
}
