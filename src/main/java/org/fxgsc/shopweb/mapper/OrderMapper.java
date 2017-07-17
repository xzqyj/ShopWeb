package org.fxgsc.shopweb.mapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fxgsc.shopweb.domain.UserOrder;


public interface OrderMapper extends Serializable {

	/*
	 * 提交订单
	 */
	@Insert("insert into tb_userorder(user_name,good_id,good_name,good_picture,good_price,good_num,order_price,"
			+ "user_address,order_status) values (#{username},#{goodid},#{goodname},#{goodpicture},#{goodprice},#{goodnum},#{orderprice},"
			+ "#{useraddress},#{orderstatus})")
	void insertUserOrder(@Param("username") String username,@Param("goodid") Integer goodid,@Param("goodname") String goodname,@Param("goodpicture") String goodpicture,@Param("goodprice") Integer goodprice,
			@Param("goodnum") Integer goodnum,@Param("orderprice") Integer orderprice,@Param("useraddress") String useraddress,@Param("orderstatus") String orderstatus);

	@Select("select * from tb_userorder where user_name = #{username}")
	List<UserOrder> orderFindAll(@Param("username") String username);
	
	

	/*
	 * 订单评价
	 */
	@Select("select * from tb_userorder where id = #{id}")
	List<UserOrder> orderFindId(@Param("id") Integer id);
	
	@Update("update tb_userorder set good_remark= #{goodremark} where id=#{id}")
	void insertGoodRemark(@Param("goodremark") String goodremark,@Param("id") Integer id);
	
	
}
