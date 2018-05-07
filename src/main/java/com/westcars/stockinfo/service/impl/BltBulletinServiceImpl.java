package com.westcars.stockinfo.service.impl;

import com.westcars.stockinfo.dao.BltBulletinMapper;
import com.westcars.stockinfo.model.BltBulletin;
import com.westcars.stockinfo.model.BulletinMin;
import com.westcars.stockinfo.service.BltBulletinService;
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
public class BltBulletinServiceImpl extends AbstractService<BltBulletin> implements BltBulletinService {
    @Resource
    private BltBulletinMapper bltBulletinMapper;

    @Override
    public List<BulletinMin> GetBulletinByCode(String code) {
        return bltBulletinMapper.GetBulletinByCode(code);
    }
}
