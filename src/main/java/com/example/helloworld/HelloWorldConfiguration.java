package com.example.helloworld;

/**
 * Created with IntelliJ IDEA.
 * User: pkondappa
 * Date: 6/9/13
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;


public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    @JsonProperty
    private String template;

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";

    public String getTemplate() {
        return template;
    }

    public String getDefaultName() {
        return defaultName;
    }
}
