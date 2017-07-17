package org.fxgsc.shopweb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fxgsc.shopweb.domain.ShopCart;


public interface ShopcartMapper {

	/*
	 * 查询购物车
	 */
	@Select("select * from tb_shopcart where user_name = #{username} ")
	List<ShopCart> shopcartfindAll(@Param("username") String username);
	/*
	 * 加入购物车
	 */
	@Insert("insert into tb_shopcart(user_name,good_id,good_name,good_picture,good_price,good_num) values (#{username},#{goodid},#{goodname},#{goodpicture},#{goodprice},#{goodnum})")
	void insertShopCart(@Param("username") String username,@Param("goodname") String goodname,@Param("goodid") Integer goodid,@Param("goodpicture") String goodpicture,@Param("goodprice") Integer goodprice,
			@Param("goodnum") Integer goodnum);
   
	@Delete("delete from tb_shopcart where good_name = #{goodname}")
	void deleteShopCart(@Param("goodname") String goodname);
}
