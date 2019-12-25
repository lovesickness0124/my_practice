package com.wangqi.cms.service;

import java.util.List;

import com.wangqi.cms.domain.Settings;
import com.wangqi.cms.domain.User;

public interface SettingsService {

	List<Settings> findAllSettings();

	Settings login(User user);

}
