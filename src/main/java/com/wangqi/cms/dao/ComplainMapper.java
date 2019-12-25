/**  
 *
 * Title: ComplainMapper.java
 *
 * Description: 
 *
 * Copyright: Copyright (c) 2019
 *
 * Company: 
 *
 * @author 王琪  
 *
 * @date 2019年12月25日  
 *
 * @version 1.0  
 *
 */
package com.wangqi.cms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wangqi.cms.domain.Complain;

/**
 *
 * Description:
 *
 * @author 王琪
 *
 * @date 2019年12月25日
 *
 */
public interface ComplainMapper {

	/**
	 *
	 * Description:
	 * 
	 * @param complain
	 * @return
	 *
	 */
	int addComplain(Complain complain);

	/**
	 *
	 * Description: 管理员查询举报
	 * @param map 
	 * 
	 * @return
	 *
	 */
	List<Complain> findComplain(Map<String, Object> map);

	/**
	 *
	 * Description: 修改次数
	 * 
	 * @param article_id
	 *
	 */
	void updateCount(@Param("article_id") int article_id);

	/**
	 *
	 * Description: 
	 * 
	 * @param id
	 * @return
	 *
	 */
	List<Complain> complainDes(@Param("id") Integer id);

}
