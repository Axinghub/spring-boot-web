package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neo.domain.User;
import com.neo.domain.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	//配置redis缓存 @Cacheable(value="user-key")   在springboot-redisTestController有使用
//    @RequestMapping("/getUser")
//    @Cacheable(value="user-key")
//    public User getUser() {
//    	User user=userRepository.findByUserName("aa");
//    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
//        return user;
//    }
//
//    @RequestMapping("/getUsers")
//    @Cacheable(value="key-Users")
//    public List<User> getUsers() {
//    	List<User> users=userRepository.findAll();
//    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
//        return users;
//    }
//    @RequestMapping("/getUserByUserName")
//    @Cacheable(value="key-Users")
//    public User getUserByUserName(@RequestParam String userName) {
//        User user=userRepository.findByUserName(userName);
//        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
//        return user;
//    }
}