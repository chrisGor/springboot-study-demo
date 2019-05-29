package com.chris.template.http;

import java.util.Map;

import com.chris.template.model.Result;
import com.chris.template.service.Service;

import feign.Feign;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class FeignClientUtils {

    public static void main(String[] args) {
        Service service = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(Service.class, "https://www.apiopen.top");

        Map result = service.getNew();
        System.out.println(result);

    }

}
