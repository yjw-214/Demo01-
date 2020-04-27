package cn.yjw.service.impl;

import cn.yjw.domain.User;
import cn.yjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	public User queryUserByUserName(String username) {
		return null;
	}
	
	/*@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUserByUserName(String username) {

		return userMapper.queryUserByUserName(username);
	}*/

}
