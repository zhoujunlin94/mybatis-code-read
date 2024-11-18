package org.apache.ibatis.mytest.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class User {

  private Long id;
  // 用户ID
  private String userId;
  // 用户名称
  private String userName;
  // 头像
  private String userHead;
  // 创建时间
  private Date createTime;
  // 更新时间
  private Date updateTime;

}
