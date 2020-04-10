package com.gaoshu.springboot.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;


public class faSongUtil {
    public static boolean faSong(String phoneNumber, String yzm, int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FfFMPUKLrx8h6P8vKNc", "FAVnwDk77QnPpi35qweNg1DY5r2Zit");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        //手机号
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        //签名
        request.putQueryParameter("SignName", "高数");
        //验证码
        request.putQueryParameter("TemplateParam", "{\"code\":\"" + yzm + "\"}");
        //模板编码
        if (flag == 1) {
            request.putQueryParameter("TemplateCode", "SMS_187571037");
        } else {
            request.putQueryParameter("TemplateCode", "SMS_187571035");
        }


        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }
}
