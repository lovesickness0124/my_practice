package com.wangqi.cms.dao;
/**
 * dao层栏目接口
 * @author Administrator
 *
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangqi.cms.domain.Channel;

public interface ChannelMapper {

	/** 查询栏目 */

	List<Channel> queryAllChannel();

}
