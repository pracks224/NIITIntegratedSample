package com.niit2.backend.NIITEComBackEnd.Dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.niit2.backend.NIITEComBackEnd.model.User;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	public User getUserDetails(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean vaildate(String user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User get(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
