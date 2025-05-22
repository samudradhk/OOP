package main;

public abstract class Message {
	protected ILogin ilogin;
	protected String from;
	protected String to;
	protected String message;
	public Message(ILogin ilogin, String from, String to, String message) {
		this.ilogin = ilogin;
		this.from = from;
		this.to = to;
		this.message = message;
	}
	public ILogin getIlogin() {
		return ilogin;
	}
	public void setIlogin(ILogin ilogin) {
		this.ilogin = ilogin;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public abstract void send(String username, String password);
	
}
