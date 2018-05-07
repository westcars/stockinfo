package com.westcars.stockinfo.dao;

import com.westcars.stockinfo.core.Mapper;
import com.westcars.stockinfo.model.NwsNews;

import java.util.List;

public interface NwsNewsMapper extends Mapper<NwsNews> {
    List<NwsNews> GetNewsByCode(String Code);
}