/**  
 *
 * Title: ComplainServiceImpl.java
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
package com.wangqi.cms.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangqi.cms.dao.ComplainMapper;
import com.wangqi.cms.domain.Complain;
import com.wangqi.cms.service.ComplainService;

/**
 *
 * Description: 
 *
 * @author 王琪
 *
 * @date 2019年12月25日
 *
 */
@Service
public class ComplainServiceImpl implements ComplainService {
	
	@Autowired
	private ComplainMapper mapper;

	/*   
	 * Description: 添加投诉内容,同时修改文章内容的次数
	 *
	 * @param complain
	 * @return  
	 *
	 * @see com.wangqi.cms.service.ComplainService#addComplain(com.wangqi.cms.domain.Complain)  
	 *
	 */
	@Override
	public int addComplain(Complain complain) {
		System.out.println("举报内容\n\n"+complain);
		// 获取文章ID
		int article_id = complain.getArticle_id();
		
		mapper.addComplain(complain);
		mapper.updateCount(article_id);
		
		System.out.println("dao层返回");
		return 1;
		
	}

	/*   
	 * Description: 查询举报表
	 *
	 * @return  
	 *
	 * @see com.wangqi.cms.service.ComplainService#findComplain()  
	 *
	 */
	@Override
	public List<Complain> findComplain(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.findComplain(map);
	}

	/*   
	 * Description: 
	 *
	 * @param id
	 * @return  
	 *
	 * @see com.wangqi.cms.service.ComplainService#complainDes(java.lang.Integer)  
	 *
	 */
	@Override
	public List<Complain> complainDes(Integer id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return mapper.complainDes(id);
	}

}
