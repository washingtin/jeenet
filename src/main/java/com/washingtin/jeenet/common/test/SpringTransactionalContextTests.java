package com.washingtin.jeenet.common.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.sql.DataSource;

/**
 * 描述：Spring 单元测试基类
 * @author jeenet
 */
@ActiveProfiles("production")
@ContextConfiguration(locations = {"/spring-context.xml"})
public class SpringTransactionalContextTests extends AbstractTransactionalJUnit4SpringContextTests {
    protected DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
        this.dataSource = dataSource;
    }
}
