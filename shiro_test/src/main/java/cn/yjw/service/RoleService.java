package cn.yjw.service;

import java.util.List;

public interface RoleService {
	
	/**
	 * 根据用户ID查询角色
	 * 
	 */
	public List<String> queryRolesByUserId(Integer userId);

}
