/**
 * 
 */
package com.demo.remittance.service;

import com.demo.remittance.model.User;

/**
 * @author dhaval
 *
 */
public interface UserService {
	public void save(User user);
	
	public User getUserById(Long id);
	
	public int updateUserById(User user);
	
	public int deleteUserById(Long id);
}
