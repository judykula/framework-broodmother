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
package com.jwy.${artifactId}.common.exception;

import com.jwy.medusa.common.exception.MyServiceException;
import com.jwy.medusa.mvc.MyStatus;

/**
 * <p>
 *     ${artifactId}业务的exception
 * </p>
 *
 * @author archetype
 * @version 1.0
 * @date ${DATE}
 */
public class SampleException extends MyServiceException {

    public SampleException() {
        super(MyStatus.of(10000, "SampleException"));//TODO 这块要改成使用 公共jar内定义的 statusz
    }

    public SampleException(MyStatus status) {
        super(status);
    }

    public SampleException(MyStatus status, Throwable cause) {
        super(status, cause);
    }
}
