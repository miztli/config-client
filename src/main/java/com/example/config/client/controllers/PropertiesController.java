package com.example.config.client.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/properties")
public class PropertiesController
{
    @Value("${some.shared.property:default if not found!}")
    private String sharedProperty;

    @Value("${property.from.a-bootiful-client.properties:default hello world!}")
    private String helloWorld;

    @GetMapping
    public Map<String, String> getProps()
    {
        return Map.of(
            "some.shared.property", sharedProperty,
            "property.from.a-bootiful-client.properties", helloWorld
        );
    }
}
