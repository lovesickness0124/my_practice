/**
 * 
 */
package com.wangqi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangqi.cms.domain.Category;

/**
 * dao层分类接口
 *
 */
public interface CategoryMapper{

	List<Category> getCategory(@Param("id") Integer id);

	
	
	
}
