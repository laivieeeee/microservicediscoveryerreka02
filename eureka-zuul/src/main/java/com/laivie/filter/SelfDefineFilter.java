package com.laivie.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;


public class SelfDefineFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //过滤器执行阶段的类型
        System.out.println("过滤器执行阶段的类型");
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        //执行顺序
        System.out.println("执行顺序");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否执行当前过滤器
        System.out.println("是否执行当前过滤器");

        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("执行自定义过滤器");
        return null;
    }
}
