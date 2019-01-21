package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.UserModel;
import mapper.UserMapper;
import service.IUserService;
import util.MD5;

@Service
public class UserServiceImpl implements IUserService {
//UserServiceImpl userServiceImpl = new UserServiceImpl();
	// ioc

	@Autowired
	private UserMapper userMapper;

	@Override
	public String login(UserModel model) {
		UserModel db = userMapper.selectId(model.getCode());
		if (db == null) {
			return "0";
		}
		if (db.getPass().equals(MD5.encode(model.getPass()))) {
			return "1";
		} else {
			return "2";
		}
	}

}
