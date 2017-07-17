package org.fxgsc.shopweb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fxgsc.shopweb.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
    @Insert("insert into tb_user(user_name,user_password,user_phone,user_address) values (#{username},#{password},#{phone},#{address})")
	void insertUser(@Param("username") String username,@Param("password") String password,@Param("phone") String phone,@Param("address") String address );
    
    
	@Select("select * from tb_user where user_name = #{username} and user_password = #{password}")
	User login(@Param("username") String username,@Param("password") String password);

	@Update("update tb_user set user_password= #{password} where user_name=#{username}")
	void updatePassword(@Param("username") String username,@Param("password") String password);
	
	@Select("select user_password from tb_user where user_name = #{username}")
	User findPassword(@Param("username") String username);
	
}

