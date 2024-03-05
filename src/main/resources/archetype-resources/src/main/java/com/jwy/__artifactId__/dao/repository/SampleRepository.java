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
package com.jwy.${artifactId}.dao.repository;

import com.jwy.${artifactId}.dao.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *     sample持久化例子 看这里{@link SampleEntity}
 * </p>
 * <p>
 *     如何写查询参考{@code https://docs.spring.io/spring-data/jpa/docs/2.7.18/reference/html/${symbol_pound}repository-query-keywords}
 * </p>
 * <p>
 *     这些是样例代码，在实际使用后删除
 * </p>
 *
 * @author archetype
 * @version 1.0
 * @date ${DATE}
 */
@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {


}
