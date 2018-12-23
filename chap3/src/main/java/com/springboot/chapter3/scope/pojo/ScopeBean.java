package com.springboot.chapter3.scope.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Citrix on 2018/12/6.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScopeBean {
}
