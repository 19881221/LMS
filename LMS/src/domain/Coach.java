package domain;

public class Coach {
	private int id;
	private String name;
	
	public Coach(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("ID : ").append(this.id).append(" | Name : ").append(this.name).toString();
	}
}
