package dao;

import pojo.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return null:没用这个用户
     */
    User queryUserByUsername(String username);

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return null:用户名或密码错误
     */
    User queryUserByUsernameAndPassword(String username,String password);

    /**
     * 保存用户信息
     * @return 返回-1表示操作失败,其他事SQL语句影响的行数
     */
    int saveUser(User user);
}
