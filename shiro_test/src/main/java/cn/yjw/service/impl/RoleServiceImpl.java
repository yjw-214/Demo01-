package cn.yjw.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.yjw.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoleServiceImpl implements RoleService {
	public List<String> queryRolesByUserId(Integer userId) {
		return null;
	}
	
/*
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<String> queryRolesByUserId(Integer userId) {
		List<Role> list = roleMapper.queryRolesByUserId(userId);
		List<String> roles=new ArrayList<String>();
		for (Role role : list) {
			roles.add(role.getRolename());
		}
		return roles;
	}
*/

}
