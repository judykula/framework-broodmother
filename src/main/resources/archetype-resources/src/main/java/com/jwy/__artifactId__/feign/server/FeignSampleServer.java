#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * easy come, easy go.
 *
 * contact : syiae.jwy@gmail.com
 *
 * · · · · ||   ..     __       ___      ____  ®
 * · · · · ||  ||  || _ ||   ||    ||   ||      ||
 * · · · · ||  ||  ${symbol_escape}${symbol_escape}_ ||_.||    ||   ${symbol_escape}${symbol_escape}_  ||
 * · · _//                                       ||
 * · · · · · · · · · · · · · · · · · ·· ·    ___//
 */
package com.jwy.${artifactId}.feign.server;

import com.jwy.medusa.common.exception.MyServiceException;
import com.jwy.medusa.mvc.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *      这是一个"feign"请求的server端例子实现
 * </p>
 * <p>
 *     ！！所有的请求路径都必须以"/feign"开头
 * </p>
 * <p>
 *     这些是样例代码，在实际使用后删除
 * </p>
 *
 * @author archetype
 * @version 1.0
 * @date ${DATE}
 */
@RestController
@RequestMapping("/feign/sample")
public class FeignSampleServer {

    @GetMapping("/f1")
    public MyResponse f1() {
        throw new MyServiceException();
    }

}
