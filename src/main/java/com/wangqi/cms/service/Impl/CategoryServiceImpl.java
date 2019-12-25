package com.wangqi.cms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqi.cms.dao.CategoryMapper;
import com.wangqi.cms.domain.Category;
import com.wangqi.cms.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	
	@Resource
	private CategoryMapper categoryMapper;

	@Override
	public List<Category> getCategory(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategory(id);
	}

}
