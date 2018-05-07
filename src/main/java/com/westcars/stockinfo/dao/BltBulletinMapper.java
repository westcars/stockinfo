package com.westcars.stockinfo.dao;

import com.westcars.stockinfo.core.Mapper;
import com.westcars.stockinfo.model.BltBulletin;
import com.westcars.stockinfo.model.BulletinMin;

import java.util.List;

public interface BltBulletinMapper extends Mapper<BltBulletin> {
    List<BulletinMin> GetBulletinByCode(String code);
}