package com.narayan.hmsc.db;

import com.narayan.hmsc.domain.Doctor;
import com.narayan.hmsc.domain.User;
import com.narayan.hmsc.domain.UserFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author unmattavesa
 *
 */
public class DataBase {

	private static DataBase dbInstance = new DataBase();

	private DataBase(){}

	public static DataBase getInstance(){
		return dbInstance;
	}

	public ArrayList<User> users = new ArrayList<User>();
	UserFactory userFactory = new UserFactory();
	User user1 = userFactory.getUser("Admin");
	User user2 = userFactory.getUser("Doctor");

	user1.setUserid("user1");
	user1.setPassword("pwd");
	user1.setUserType("admin");
	user1.setName("First user");
	user1.age(1);
	users.add(user1);

	user2.setUserid("user2");
	user2.setPassword("pwd");
	user2.setUserType("admin2");
	user2.setName("second user");
	user2.age(1);
	user2.setSpecialization("neurology");
	user2.setExperience("2");
	users.add(user2);

//	public User[] users = new User[] {
//			new User("user1", "pwd", "admin", "first user", 1),
//			new User("user2", "pwd", "admin", "second user", 2),
//			new User("user3", "pwd", "admin", "third user", 3),
//			new Doctor("siva123", "pwd", "siva narayana", 24) {{
//				setSpecialization("cardiaic");
//				setExperience(2);
//			}},
//			new Doctor("shankar123", "pwd", "shankar narayana", 26) {{
//				setSpecialization("neurology");
//				setExperience(4);
//			}}
//	};
	
	 public void save(User user) {
		 User[] _users = new User[users.size() + 1];
		 for(int i=0; i<users.size(); i++) {
			 _users[i] = users[i];
		 }
		 
		 _users[_users.length - 1] = user;
		 setUsers(_users);
	 }

	private void setUsers(ArrayList<User> _users) {
		users = _users;
	}
	
	public static boolean exists(User user) {
		for(User u : dbInstance.users) {
			if(u.equals(user)) return true;
		}
		return false;
	}
	
	public static boolean exists(String userId) {
		for(User u : dbInstance.users) {
			if(userId.equals(u.getUserid())) return true;
		}
		return false;
	}
	
	public static User find(String userId) {
		for(User u : dbInstance.users) {
			if(userId.equals(u.getUserid())) return u;
		}
		return null;
	}
	
	public static boolean delete(String userId) {
		if(exists(userId)) {
			User[] _users = new User[dbInstance.users.size() - 1];

			 for(User user: dbInstance.users) {
				 if(!userId.equals(dbInstance.users.getUserid())) {
					 _users.add(dbInstance.users[i]);
				 }
			 }
			 dbInstance.setUsers(_users);
			 return true;
		}
		 return false;
	}
}
