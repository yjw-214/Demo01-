package cn.yjw.service;

import java.util.List;

public interface PermissionService {
	/**
	 * 根据用户ID查询权限
	 */
	public List<String> queryPermissionByUserId(Integer userId);
}
