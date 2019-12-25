package com.wangqi.cms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqi.cms.dao.SlideMapper;
import com.wangqi.cms.domain.Slide;
import com.wangqi.cms.service.SlideService;
@Service
/**注解事务*/
@Transactional
public class SlideServiceImpl implements SlideService{
	
	@Resource
	private SlideMapper slideMapper;

	@Override
	public List<Slide> querySlied() {
		// TODO Auto-generated method stub
		return slideMapper.querySlied();
	}

}
