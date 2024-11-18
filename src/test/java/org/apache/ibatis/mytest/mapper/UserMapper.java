package org.apache.ibatis.mytest.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mytest.pojo.User;

import java.util.List;

public interface UserMapper {

  User queryUserInfo(User req);

  @Select("SELECT id, userId, userName, userHead\n" +
    "FROM user")
  List<User> queryUserInfoList();

}
