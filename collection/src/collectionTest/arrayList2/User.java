package collectionTest.arrayList2;

import java.util.Objects;

public class User {
//	1. private 필드 구성(private Long id)
	private String id;
	private String name;
	private String password;
	private String phone;
	
//	2. 기본 생성자, 초기화 생성자
	public User() {;}
	public User(String id, String name, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	
//	3. getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	4. toString 오버라이딩
	@Override
		public String toString() {
			return super.toString();
		}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
//	5. hashCode, equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
}
