package com.ck.controller;

import com.ck.entity.Sushe;
import com.ck.service.ISusheService;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年03月30日 10:42
 */
@Controller
public class SusheController {

    @Autowired
    private ISusheService susheService;
    // use apache log4j
    Logger logger = Logger.getLogger(SusheController.class);
    // @GetMappingqing
    @GetMapping("queryAll")
    public String queryAll(ModelMap map){

        List<Sushe> susheList = null;
        try {
            logger.debug("query sushe doing......");
            susheList = susheService.queryAll();
            logger.debug("query sushe done......");
            map.put("susheList", susheList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("query sushe error:",e);
        }
        return "index";
    }
}
