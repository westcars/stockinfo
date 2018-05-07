package com.westcars.stockinfo.web;
import com.westcars.stockinfo.core.Result;
import com.westcars.stockinfo.core.ResultGenerator;
import com.westcars.stockinfo.model.NwsNews;
import com.westcars.stockinfo.service.NwsNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/05/07.
*/
@RestController
@RequestMapping("/stock/news")
public class NwsNewsController {
    @Resource
    private NwsNewsService nwsNewsService;

//    @PostMapping("/list")
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
//        PageHelper.startPage(page, size);
//        List<NwsNews> list = nwsNewsService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }
    @GetMapping("/get")
    public Result getStrockNewsByGid(@RequestParam(defaultValue = "0") Integer page,
                                     @RequestParam(defaultValue = "10") Integer size,
                                    @RequestParam(defaultValue = "") String gid) {
        PageHelper.startPage(page, size);
        List<NwsNews> list = nwsNewsService.GetNewsByCode(gid);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
