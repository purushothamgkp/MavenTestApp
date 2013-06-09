package com.example.helloworld;

/**
 * Created with IntelliJ IDEA.
 * User: pkondappa
 * Date: 6/9/13
 * Time: 10:59 AM
 * To change this template use File | Settings | File Templates.
 */

import com.example.helloworld.health.TemplateHealthCheck;
import com.example.helloworld.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class HelloWorldService extends Service<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();
        environment.addResource(new HelloWorldResource(template, defaultName));
        environment.addHealthCheck(new TemplateHealthCheck(template));
    }

}
