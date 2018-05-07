package com.westcars.stockinfo.web;
import com.westcars.stockinfo.core.Result;
import com.westcars.stockinfo.core.ResultGenerator;

import com.westcars.stockinfo.model.BulletinMin;
import com.westcars.stockinfo.service.BltBulletinService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/05/07.
*/
@RestController
@RequestMapping("/stock/bulletin")
public class BltBulletinController {
    @Resource
    private BltBulletinService bltBulletinService;

//
//    @PostMapping("/list")
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
//        PageHelper.startPage(page, size);
//        List<BltBulletin> list = bltBulletinService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }

    @GetMapping("/get")
    public Result getStockBltByGid(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size,String gid) {
        PageHelper.startPage(page, size);
        List<BulletinMin> list = bltBulletinService.GetBulletinByCode(gid);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
