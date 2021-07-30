package com.wuliu.system.modules.monitor.service;

import com.wuliu.system.modules.monitor.domain.RedisInfo;
import com.wuliu.system.modules.monitor.exception.RedisConnectException;

import java.util.List;
import java.util.Map;

public interface RedisService {

	/**
	 * 获取 redis 的详细信息
	 *
	 * @return List
	 */
	List<RedisInfo> getRedisInfo() throws RedisConnectException;

	/**
	 * 获取 redis key 数量
	 *
	 * @return Map
	 */
	Map<String, Object> getKeysSize() throws RedisConnectException;

	/**
	 * 获取 redis 内存信息
	 *
	 * @return Map
	 */
	Map<String, Object> getMemoryInfo() throws RedisConnectException;

}