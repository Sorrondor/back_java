package jsonTest;

import java.util.ArrayList;
import java.util.Objects;

import org.json.JSONArray;
import org.json.JSONObject;

public class User {
//	id, name, age, job
	private Long id;
	private String name;
	private int age;
	private String job;
	
//	생성자
	public User() {;}
	public User(Long id, String name, int age, String job) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
	}

//	getter, setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJSON = new JSONArray();
		JSONObject userJSON = new JSONObject();
		
		User user1 = new User(1L, "홍길동", 18, "개발자");
		User user2 = new User(1L, "장보고", 19, "기획자");
		User user3 = new User(1L, "이순신", 20, "디자이너");
		User user4 = new User(1L, "이성계", 21, "개발자");
		User user5 = new User(1L, "이태희", 22, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
		System.out.println(new JSONObject(users));
	}
}
