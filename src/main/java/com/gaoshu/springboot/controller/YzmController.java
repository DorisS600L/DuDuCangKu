package com.gaoshu.springboot.controller;

import com.gaoshu.springboot.util.faSongUtil;
import com.gaoshu.springboot.util.shengChengUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YzmController {
    @RequestMapping("/sendSms")
    public  String sendSms(String phoneNumber,int flag){
   String yzm= shengChengUtil.getYzm();
   boolean jieguo=faSongUtil.faSong(phoneNumber,yzm,flag);
   if (jieguo){
    return yzm;
   }else {

   }
    return yzm;
    }
}
