package cn.tjd.controller;

import cn.tjd.entity.User;
import cn.tjd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Auther: TJD
 * @Date: 2020-07-04
 * @DESCRIPTION:
 **/
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/test")
    public String test(){
        return "Hello World";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<User> test2(){
        List<User> users = userMapper.listAllUser();
        return users;
    }
}
