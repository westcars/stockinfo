package com.westcars.stockinfo.service;
import com.westcars.stockinfo.model.BltBulletin;
import com.westcars.stockinfo.core.Service;
import com.westcars.stockinfo.model.BulletinMin;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/07.
 */
public interface BltBulletinService extends Service<BltBulletin> {

    List<BulletinMin> GetBulletinByCode(String code);
}
