package com.springboot.chapter3.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Citrix on 2018/12/6.
 */
public class DatabaseConditional implements Condition {
    /*
     *
     * @param context 条件上下文
     * @param
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return (env).containsProperty("database.driverName") && env.containsProperty("database.url")
                && env.containsProperty("database.username") && env.containsProperty("database.password");
    }
}
