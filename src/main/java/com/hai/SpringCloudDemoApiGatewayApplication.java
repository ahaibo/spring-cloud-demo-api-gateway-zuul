package com.hai;

import com.hai.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class SpringCloudDemoApiGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudDemoApiGatewayApplication.class).web(true).run(args);
    }

    //实例化 ZullFilter
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
