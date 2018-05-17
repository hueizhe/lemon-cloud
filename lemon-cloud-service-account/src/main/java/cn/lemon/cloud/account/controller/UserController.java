package cn.lemon.cloud.account.controller;


import cn.lemon.cloud.account.entity.User;
import cn.lemon.cloud.account.repository.IUserRepository;
import cn.lemon.framework.core.BasicController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by lonyee on 2017/4/6.
 */
@RestController
public class UserController extends BasicController {
    @Resource
    private IUserRepository userRepository;

    @GetMapping(value = "/user/${moblie}")
    public User getUserByMoblie(@PathVariable String moblie) {
        User user = userRepository.findByMobile(moblie);
        return user;
    }
}
