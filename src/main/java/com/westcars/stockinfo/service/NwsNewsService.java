package com.westcars.stockinfo.service;
import com.westcars.stockinfo.model.NwsNews;
import com.westcars.stockinfo.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/07.
 */
public interface NwsNewsService extends Service<NwsNews> {
    List<NwsNews> GetNewsByCode(String code);
}
