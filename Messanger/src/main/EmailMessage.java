package main;

public class EmailMessage extends Message{

	public EmailMessage(ILogin ilogin, String from, String to, String message) {
		super(ilogin, from, to, message);
	}

	@Override
	public void send(String username, String password) {
		if(ilogin.authenticate(username, password)) {
			System.out.println("Email sent from "+from+" to "+to+": "+message);
		}else {
			System.out.println("Email authentication failed for user: "+username);
		}
		
	}
}
