package org.fxgsc.shopweb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fxgsc.shopweb.domain.Good;
import org.fxgsc.shopweb.domain.Save;


public interface GoodMapper {
	
	/*
	 * 查询所有商品
	 */
	@Select("select * from tb_good")
	List<Good> goodfindfAll ();
		
	/*
	 * nv
	 */
	@Select("select * from tb_good where good_category='女装'")
	List<Good> goodfindnv ();
		
	/*
	 * watch
	 */
	@Select("select * from tb_good where good_category='手表'")
	List<Good> goodfindwatch ();
		
	/*
	 * ccc
	 */
	@Select("select * from tb_good where good_category='3C'")
	List<Good> goodfind3C ();
	
	/*
	 * 添加商品
	 */
	@Insert("insert into tb_good(good_id,good_name,good_price,good_picture,good_picture1,good_picture2,good_category,good_description,good_savenum) values (#{goodid},"
			+ "#{goodname},#{goodprice},#{goodpicture},#{goodpicture1},#{goodpicture2},#{goodcategory},#{gooddescription},#{goodsavenum})")
	void insertGood(@Param("goodid") Integer goodid,@Param("goodname") String goodname,@Param("goodprice") Integer goodprice, @Param("goodpicture") String goodpicture,@Param("goodpicture1") String goodpicture1,@Param("goodpicture2") String goodpicture2,
			@Param("goodcategory") String goodcategory,@Param("gooddescription") String gooddescription,@Param("goodsavenum") Integer goodsavenum);
	/*
	 * 更新商品
	 */
	@Update("update tb_good set good_id=#{goodid},good_name=#{goodname},good_price=#{goodprice},good_picture=#{goodpicture},good_picture1=#{goodpicture1},good_picture2=#{goodpicture2},"
			+ "good_category=#{goodcategory},good_description=#{gooddescription},good_savenum=#{goodsavenum} where good_id=#{goodid}")
	void updateGood(@Param("goodid") Integer goodid,@Param("goodname") String goodname,@Param("goodprice") Integer goodprice, @Param("goodpicture") String goodpicture,@Param("goodpicture1") String goodpicture1,@Param("goodpicture2") String goodpicture2,
			@Param("goodcategory") String goodcategory,@Param("gooddescription") String gooddescription,@Param("goodsavenum") Integer goodsavenum);
	
	
	/*
	 * 页面详情
	 */
	@Select("select * from tb_good where good_name = #{goodname}")
	List<Good> goodfindone(@Param("goodname") String goodname);
	
	/*
	 * 收藏商品 
	 */
	
	@Insert("insert into tb_save(user_name,good_name,good_picture) values (#{username},#{goodname},#{goodpicture})")
	void mysaveAdd(@Param("username") String username,@Param("goodname") String goodname,@Param("goodpicture") String goodpicture);
	
	@Select("select * from tb_save where user_name = #{username}")
	List<Save> mysaveFindAll(@Param("username") String username);
	
	@Delete("delete from tb_save where good_name = #{goodname}")
	void mysaveDelete(@Param("goodname") String goodname);
}
