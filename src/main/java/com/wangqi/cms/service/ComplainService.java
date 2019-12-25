/**  
 *
 * Title: ComplainService.java
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
package com.wangqi.cms.service;

import java.util.List;
import java.util.Map;

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
public interface ComplainService {

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
	 * Description: 
	 * @param map 
	 * 
	 * @return
	 *
	 */
	List<Complain> findComplain(Map<String, Object> map);

	/**
	 *
	 * Description: 
	 * 
	 * @param id
	 * @return
	 *
	 */
	List<Complain> complainDes(Integer id);

}
