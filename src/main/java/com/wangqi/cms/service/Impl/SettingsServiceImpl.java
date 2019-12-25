package com.wangqi.cms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqi.cms.dao.SettingsMapper;
import com.wangqi.cms.domain.Settings;
import com.wangqi.cms.domain.User;
import com.wangqi.cms.service.SettingsService;

@Service
@Transactional
public class SettingsServiceImpl implements SettingsService{
	
	@Resource
	private SettingsMapper mapper;

	@Override
	public List<Settings> findAllSettings() {
		// TODO Auto-generated method stub
		return mapper.findAllSettings();
	}

	@Override
	public Settings login(User user) {
		System.out.println(user.getUsername()+user.getPassword());
		return mapper.login(user);
	}

}
