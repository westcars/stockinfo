package com.westcars.stockinfo.web;
import com.westcars.stockinfo.core.Result;
import com.westcars.stockinfo.core.ResultGenerator;
import com.westcars.stockinfo.model.PubSecuritiesmain;
import com.westcars.stockinfo.service.PubSecuritiesmainService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/05/05.
*/
@RestController
@RequestMapping("/stock")
public class PubSecuritiesmainController {
    @Resource
    private PubSecuritiesmainService pubSecuritiesmainService;


    @GetMapping("/get")
    public Result detail(@RequestParam Integer id) {
        PubSecuritiesmain pubSecuritiesmain = pubSecuritiesmainService.findById(id);
        return ResultGenerator.genSuccessResult(pubSecuritiesmain);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PubSecuritiesmain> list = pubSecuritiesmainService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
