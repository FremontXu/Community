package com.nowcoder.community.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassName: AlphaService <br/>
 * Description: <br/>
 * date: 2022/2/24 16:58<br/>
 *
 * @author thxx<br />
 * @since JDK 1.8
 */
@Service
public class AlphaService {

    public AlphaService(){
        System.out.println("Construct");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }

}
