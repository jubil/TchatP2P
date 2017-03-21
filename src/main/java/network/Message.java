package network;

public class Message {

	private long date;
	private String login, text;
	
	public Message(String login, String text) {
		this(System.nanoTime(), login, text);
	}

	public Message(long date, String login, String text) {
		super();
		this.date = date;
		this.login = login;
		this.text = text;
	}

	public long getDate() {
		return date;
	}

	public String getLogin() {
		return login;
	}

	public String getText() {
		return text;
	}

}
