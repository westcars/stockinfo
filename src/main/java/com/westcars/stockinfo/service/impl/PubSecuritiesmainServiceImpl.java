package com.westcars.stockinfo.service.impl;

import com.westcars.stockinfo.dao.PubSecuritiesmainMapper;
import com.westcars.stockinfo.model.PubSecuritiesmain;
import com.westcars.stockinfo.service.PubSecuritiesmainService;
import com.westcars.stockinfo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/05.
 */
@Service
@Transactional
public class PubSecuritiesmainServiceImpl extends AbstractService<PubSecuritiesmain> implements PubSecuritiesmainService {
    @Resource
    private PubSecuritiesmainMapper pubSecuritiesmainMapper;

}
