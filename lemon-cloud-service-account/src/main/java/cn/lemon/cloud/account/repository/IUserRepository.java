package cn.lemon.cloud.account.repository;

import cn.lemon.cloud.account.entity.User;
import cn.lemon.framework.core.IBasicDao;
import org.springframework.stereotype.Repository;

/**************************
 * user
 * 用户表
 * @author lonyee
 * @date 2017-04-05 15:20:52
 * 
 **************************/
@Repository
public interface IUserRepository extends IBasicDao<User, Integer>{
    /**
     * 根据手机号查询用户信息
     */
    User findByMobile(String mobile);
}
