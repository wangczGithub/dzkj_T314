package com.ck.service.impl;

import com.ck.dao.ISusheDao;
import com.ck.entity.Sushe;
import com.ck.service.ISusheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年03月30日 10:41
 */
@Service
public class ISusheServiceImpl implements ISusheService {

    @Autowired
    private ISusheDao susheDao;

    @Override
    public List<Sushe> queryAll() {
        return susheDao.queryAll();
    }
}
