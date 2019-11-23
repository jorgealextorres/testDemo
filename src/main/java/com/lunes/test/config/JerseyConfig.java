package com.lunes.test.config;

import com.lunes.test.endpoint.Prueba;
import com.lunes.test.endpoint.HelloService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(HelloService.class);
        register(Prueba.class);
        //register(ReverseService.class);
    }
}

