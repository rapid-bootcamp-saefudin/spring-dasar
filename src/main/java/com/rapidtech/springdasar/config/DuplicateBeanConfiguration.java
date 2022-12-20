package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
