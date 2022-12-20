package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class DuplicateBeanConfigurationTest {
    private static ApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
    }

    @Test
    void DuplicateBeanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);

        Foo foo3 = context.getBean("foo1", Foo.class);
        Assertions.assertSame(foo1, foo3);

        Foo foo4 = context.getBean("foo2", Foo.class);
        Assertions.assertSame(foo2, foo4);
    }

    @Test
    void primaryBeanTest() {
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean("foo1", Foo.class);

        Assertions.assertSame(foo1, foo2);

        Foo foo3 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(foo1, foo3);
    }
}
