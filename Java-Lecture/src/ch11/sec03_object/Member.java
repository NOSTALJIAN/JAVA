package ch11.sec03_object;

public class Member {
	String id;
	String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id) && name.equals(member.name)) {
			if (id.equals(member.id) && name.equals(member.name)) {
				
			}
		}
	}
}