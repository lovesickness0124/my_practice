package com.wangqi.cms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqi.cms.dao.ChannelMapper;
import com.wangqi.cms.domain.Channel;
import com.wangqi.cms.service.ChannelService;

@Service
@Transactional
public class ChannelServiceImpl implements ChannelService{
	
	@Resource
	private ChannelMapper channelmapper;

	/**查询栏目*/
	@Override
	public List<Channel> queryAllChannel() {
		// TODO Auto-generated method stub
		return channelmapper.queryAllChannel();
	}


}
