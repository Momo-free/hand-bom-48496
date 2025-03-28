package com.hand.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerTags {

    public static final String Menu = "Menu";
    public static final String Combo = "Combo";
    public static final String MATERIAL = "material";

    @Autowired
    public SwaggerTags(Docket docket) {
        docket.tags(
                new Tag(Menu, "Menu 案例"),
                new Tag(Combo, "套餐 案例"),
                new Tag(MATERIAL, "食材 案例")
        );
    }
}
