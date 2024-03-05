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
package com.jwy.${artifactId}.dao.entity;

import com.jwy.warlock.strategy.AbstractSpecifyIdEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * <p>
 *     例子entity1: 继承{@link AbstractSpecifyIdEntity}，id字段需要自己赋值
 *
 *     比如这样:
 *     <pre>
 *         long id = 1232;//生成id
 *
 *         SampleEntity2 entity = new SampleEntity2();
 *         entity.setId(id);
 *     </pre>
 * </p>
 * <p>
 *     <u>请优先使用此策略</u>，配合{@link com.jwy.arcwarden.IdGeneratorClient}生成分布式Id使用
 * </p>
 * <p>
 *     我在配置里添加了这条"{@code spring.jpa.hibernate.ddl-auto=update}"，代表系统启动时自动根据{@code Entity}生成表，
 *     嗯...这个叫"模型驱动开发"^-^，所以在开发阶段你只需要注意维护entity即可，不需要手动建表。
 *     <font color='red'>注意这个配置不能在生产环境配置</font>
 *     <br/><br/>
 *     自动生成的建表语句是这样的：
 *     <pre>
 *          CREATE TABLE `sample2` (
 *              `id` bigint NOT NULL,
 *              `create_time` bigint DEFAULT NULL,
 *              `update_time` bigint NOT NULL,
 *              `age` int NOT NULL,
 *              `birthday` datetime(6) NOT NULL,
 *              `first_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
 *              PRIMARY KEY (`id`),
 *              KEY `idx_bd` (`birthday`),
 *              KEY `idx_ctime_age` (`create_time`,`age`)
 *          ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 *     </pre>
 * </p>
 * <p>
 *     请参考:
 *     {@link com.jwy.${artifactId}.dao.repository.SampleRepository SampleRepository}
 *     {@link com.jwy.${artifactId}.service.SampleService SampleService}
 *     {@link com.jwy.${artifactId}.web.SampleController SampleController}
 *     等"sample"系的例子
 * </p>
 * <p>
 *     这些是样例代码，在实际使用后删除
 * </p>
 *
 * @author archetype
 * @version 1.0
 * @date ${DATE}
 */
@Entity
@Data
@Table(name = "sample", indexes = {
        @Index(name = "idx_bd", columnList = "birthday"),
        @Index(name = "idx_ctime_age", columnList = "createTime, age")
})
public class SampleEntity extends AbstractSpecifyIdEntity {

    @Column(length = 100, nullable = false)
    private String firstName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(length = 100, nullable = false)
    private Date birthday;

    @Column(nullable = false)
    private Integer age;
}