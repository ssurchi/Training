package com.simpleprogrammer;

import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello Computer");

		Session session = HibernateUtilities.getSessionFactory().openSession();
//		session.beginTransaction();
		
		User user = new User();
//		user.setName("Joe");
//		user.getProteinData().setGoal(250);
//		session.save(user);
		
//		session.getTransaction().commit();
		
		session.beginTransaction();
		
		User loadedUser = (User) session.get(User.class, 1);
		System.out.println(loadedUser.getId());
		System.out.println(loadedUser.getName());
		System.out.println(loadedUser.getProteinData().getGoal());
		
		// by doing this. when the commit is run below, it will update the database 
		// with the new value for the loadedUser.

		loadedUser.getProteinData().setTotal(loadedUser.getProteinData().getTotal() + 50);
		loadedUser.getProteinData().setGoal(loadedUser.getProteinData().getGoal() + 50);
		
		session.getTransaction().commit();
		
		session.close();
		
		
		HibernateUtilities.getSessionFactory().close();
	}

}
