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
package com.jwy.${artifactId}.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * <p>
 *      这是一个关于"DTO"的例子
 * </p>
 *
 * <p>
 *     关于各个层之间的数据传输对象定义：
 *     <pre>
 *          [View] -> xxxRequest -> [Controller] ->  xxxDto -> [Service] -> xxxEntity -> [Repository]
 *
 *          [View] <- xxxResponse <- [Controller] <-  xxxBo <- [Service] <- xxxEntity <- [Repository]
 *     </pre>
 * </p>
 * <p>
 *     这些是样例代码，在实际使用后删除
 * </p>
 *
 * @author archetype
 * @version 1.0
 * @date ${DATE}
 */
@Data
public class SampleDto {

    private String firstName;
    private Date birthday;
    private Integer age;

}
