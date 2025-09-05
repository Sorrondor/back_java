package streamTask2;

import java.util.Objects;

//	필드구성:이름, 취미, 소개
public class Member {
	private long id;
	private String name;
	private String hobby;
	private String introduction;
	private static Long seq;
	
//	시퀀스
	static {
		seq = 0L;
	}
	
//	생성자가 호출될 때 마다
	{
		this.id = seq++;
	}
	
//	생성자
	public Member() {;}
	public Member( String name, String hobby, String introduction) {
		this.name = name;
		this.hobby = hobby;
		this.introduction = introduction;
	}
	
//	getter, setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", introduction=" + introduction + "]";
	}

	
	
	
}
