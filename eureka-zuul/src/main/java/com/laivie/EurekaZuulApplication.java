package com.laivie;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import javax.annotation.PostConstruct;
import java.io.File;

@SpringBootApplication
@EnableZuulProxy
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }
    @PostConstruct
    public void zuulInit(){
        FilterLoader.getInstance().setCompiler(new GroovyCompiler());
        //过滤器的路径
        String scriptRoot = System.getProperty("zuul.filter.root","groovy/filters");
        //定时器时间，5秒刷新一次
        String refreshInterval = System.getProperty("zuul.filter.refreshInterval","5");
        if(scriptRoot.length() > 0){
            scriptRoot += File.separator;
        }
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());
            FilterFileManager.init(Integer.parseInt(refreshInterval),
                    scriptRoot+"pre", scriptRoot+"route", scriptRoot+"post");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
