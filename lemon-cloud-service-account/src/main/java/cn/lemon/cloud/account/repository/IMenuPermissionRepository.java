package cn.lemon.cloud.account.repository;

import cn.lemon.cloud.account.entity.MenuPermission;
import cn.lemon.framework.core.IBasicDao;
import org.springframework.stereotype.Repository;

/**************************
 * menu_permission
 * 菜单-权限表
 * @author lonyee
 * @date 2017-04-17 16:36:05
 * 
 **************************/
@Repository
public interface IMenuPermissionRepository extends IBasicDao<MenuPermission, Integer>{
	
}
