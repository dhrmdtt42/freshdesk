package kali.freshdesk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

import kali.freshdesk.api.CreateTicketApi;

public class CreateTicket {
	
	public static String create() throws IOException{
		URL url = new URL(ApiName.endPoint+ApiName.createTicket);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        String basicAuth = "" + new String(new Base64().encode(ApiName.token.getBytes()));
        con.setRequestProperty("Authorization", basicAuth);
        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
        CreateTicketApi ct=new CreateTicketApi();
        ct.setName("kali");
        ct.setSubject("first create API");
        ct.setEmail("gelobmith@gmail.com");
        ct.setDescription("history behind gelobmith");
        wr.write(ct.toString());
        wr.flush();
        InputStreamReader inputStreamReader = new InputStreamReader(con.getInputStream());
        BufferedReader br=new BufferedReader(inputStreamReader);
        String str=br.readLine();
       	return str;
	}
}
