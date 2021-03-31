package com.ck.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Description：mybatis操作数据库的工具类
 * @Author：wangcz
 * @Date 2020年11月30日 13:49
 */
public class MybatisUtil {
    // 数据库对象
    private static SqlSessionFactory sessionFactory;
    private static SqlSession sqlSession;

    // 解析mybatis核心配置文件创建数据库
    static{
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sessionFactory =
                    new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义方法获取数据库操作对象sqlsession
     * @param trancation：需要事务传true，不需要事务传false
     * @return
     */
    public static SqlSession openSession(boolean trancation){
        if(sqlSession == null){
            sqlSession =  sessionFactory.openSession(trancation);
        }
        return sqlSession;
    }
}
