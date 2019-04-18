/**
 * 
 */
package com.demo.remittance.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.demo.remittance.model.User;

/**
 * @author dhaval
 *
 */
@Repository
public interface UserDao {

	public void save(User user);
	
	public User getUserById(@Param("id") Long id);
	
	public int updateUserById(User user);
	
	public int deleteUserById(@Param("id") Long id);
}
