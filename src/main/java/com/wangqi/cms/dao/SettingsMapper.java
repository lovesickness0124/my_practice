package com.wangqi.cms.dao;

import java.util.List;

import com.wangqi.cms.domain.Settings;
import com.wangqi.cms.domain.User;

/**
 * dao层设置接口
 * @author Administrator
 *
 */
public interface SettingsMapper {

	List<Settings> findAllSettings();

	Settings login(User user);

}
