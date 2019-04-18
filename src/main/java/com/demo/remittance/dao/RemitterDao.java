/**
 * 
 */
package com.demo.remittance.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author dhaval
 *
 */
@Repository
public interface RemitterDao {

	@Select("SELECT fname FROM remitter WHERE mobile = #{mobile}")
	public String getRemitterNameByMobileNumber(@Param("mobile")String mobileNumber);
}
