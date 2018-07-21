package com.github.service;

import com.github.model.User;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService implements UserServiceFeign {

	public User getUser(Integer id) {
		return new User(id, id + "成都iMiracle123456", 28);
	}

	@Override
	public String hello() {
		return "hello: " + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	public User userInfo(Integer id) {
		return new User(id, id + "成都iMiracle123456", 28);
	}
}
