package com.westcars.stockinfo.web;

import com.westcars.stockinfo.core.Result;
import com.westcars.stockinfo.core.ResultGenerator;
import com.westcars.stockinfo.tools.getdata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.westcars.stockinfo.tools.getdata.getResponse;

@RestController
@RequestMapping("/stock")
public class gp {
@GetMapping("/details")
    private Result getgpinfo(String gid, String key, String url)
    {
        String newUrl=url+"?key="+key+"&gid="+gid;
        String conText="";

        String result;
        result= getResponse(newUrl,conText);
        return ResultGenerator.genSuccessResult(result);
    }
}
