package org.apache.ibatis.mytest;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mytest.mapper.UserMapper;
import org.apache.ibatis.mytest.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

/**
 * @author zhoujunlin
 * @date 2024-11-11-14:51
 */
@Slf4j
public class MybatisTest {

  @Test
  @SneakyThrows
  public void test() {
    Reader resource = Resources.getResourceAsReader("org/apache/ibatis/mytest/resources/mybatis-config-datasource.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);

    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User query = new User();
    query.setId(1L);
    User user = mapper.queryUserInfo(query);
    log.info(user.toString());
  }


}
