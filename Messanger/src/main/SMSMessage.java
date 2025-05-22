package main;

public class SMSMessage extends Message{

	public SMSMessage(ILogin ilogin, String from, String to, String message) {
		super(ilogin, from, to, message);
	}

	@Override
	public void send(String username, String password) {
		if(ilogin.authenticate(username, password)) {
			System.out.println("SMS sent from "+from+" to "+to+": "+message);
		}else {
			System.out.println("SMS authentication failed for user: "+username);
		}
		
	}

}
