package com.laivie.groovy.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

public class DynamicFilter extends ZuulFilter {
    @Override
    public Object run() {
        System.out.println("===>这里是用groovy实现的动态加载过滤器");
        return null;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("===>是否执行当前过滤器");
        return true;
    }

    @Override
    public int filterOrder() {
        //
        System.out.println("===>执行顺序");
        return 3;
    }

    @Override
    public String filterType() {
        //
        System.out.println("===>过滤器执行阶段的类型");
        return FilterConstants.ROUTE_TYPE;
    }
}
