package cn.tulingxueyuan.dao.impl;

import cn.tulingxueyuan.beans.Role;
import cn.tulingxueyuan.dao.RoleDao;
import cn.tulingxueyuan.dao.UserDao;
import org.springframework.stereotype.Repository;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Repository
public class RoleDaoImpl implements RoleDao {


    @Override
    public Role get(Integer id) {
        if(id==null){
            throw new NullPointerException();
        }
        // 数据库执行SELECT
        return new Role();
    }

    @Override
    public void add(Role role)  {
        if(role==null){
            throw new NullPointerException();
        }
        // 数据库执行ADD
    }

    @Override
    public void delete(Integer id) {
        if(id==null){
            throw new NullPointerException();
        }
        // 数据库执行DELETE
    }

    @Override
    public void update(Role role) {
        if(role==null){
            throw new NullPointerException();
        }
        // 数据库执行UPDATE
    }
}
