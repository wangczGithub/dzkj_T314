package com.ck;

import static org.junit.Assert.assertTrue;

import com.ck.dao.ISusheDao;
import com.ck.entity.Sushe;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.openSession(false);
        ISusheDao susheDao = sqlSession.getMapper(ISusheDao.class);
        List<Sushe> sushes = susheDao.queryAll();
        System.out.println(sushes);
    }
}
