package com.westcars.stockinfo.service.impl;

import com.westcars.stockinfo.dao.NwsNewsMapper;
import com.westcars.stockinfo.model.NwsNews;
import com.westcars.stockinfo.service.NwsNewsService;
import com.westcars.stockinfo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/07.
 */
@Service
@Transactional
public class NwsNewsServiceImpl extends AbstractService<NwsNews> implements NwsNewsService {
    @Resource
    private NwsNewsMapper nwsNewsMapper;

    @Override
    public List<NwsNews> GetNewsByCode(String code) {
        return nwsNewsMapper.GetNewsByCode(code);
    }
}
