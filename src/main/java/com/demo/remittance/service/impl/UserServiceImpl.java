/**
 * 
 */
package com.demo.remittance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.remittance.dao.UserDao;
import com.demo.remittance.model.User;
import com.demo.remittance.service.UserService;

/**
 * @author Dhaval
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	/* (non-Javadoc)
	 * @see com.demo.remittance.service.UserService#save(com.demo.remittance.model.User)
	 */
	public void save(User user) {
		userDao.save(user);

	}

	/* (non-Javadoc)
	 * @see com.demo.remittance.service.UserService#getUserById(java.lang.Long)
	 */
	public User getUserById(Long id) {
		return userDao.getUserById(id);
	}

	/* (non-Javadoc)
	 * @see com.demo.remittance.service.UserService#updateUserById(com.demo.remittance.model.User)
	 */
	public int updateUserById(User user) {
		return userDao.updateUserById(user);
	}

	/* (non-Javadoc)
	 * @see com.demo.remittance.service.UserService#deleteUserById(java.lang.Long)
	 */
	public int deleteUserById(Long id) {
		return userDao.deleteUserById(id);
	}

}
