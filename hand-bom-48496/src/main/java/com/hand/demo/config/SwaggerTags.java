package com.hand.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerTags {

    public static final String Menu = "Menu";

    @Autowired
    public SwaggerTags(Docket docket) {
        docket.tags(
                new Tag(Menu, "Menu 案例")
        );
    }
}
