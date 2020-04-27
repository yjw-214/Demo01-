package cn.yjw.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.yjw.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PermissionServiceImpl implements PermissionService {
	public List<String> queryPermissionByUserId(Integer userId) {
		return null;
	}

	/*@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public List<String> queryPermissionByUserId(Integer userId) {
		List<Permission> list = permissionMapper.queryPermissionByUserId(userId);
		List<String> perimssions = new ArrayList<>();
		for (Permission permission : list) {
			perimssions.add(permission.getPercode());
		}
		return perimssions;
	}
*/
}
