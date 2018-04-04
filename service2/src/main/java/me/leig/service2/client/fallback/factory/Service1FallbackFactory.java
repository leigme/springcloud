package me.leig.service2.client.fallback.factory;

import feign.hystrix.FallbackFactory;
import me.leig.service2.client.Service1Client;
import org.springframework.stereotype.Component;

/**
 * @author leig
 */

@Component
public class Service1FallbackFactory implements FallbackFactory<Service1Client> {

    @Override
    public Service1Client create(Throwable throwable) {
        System.out.println("create: " + throwable);
        return new Service1Client() {
            @Override
            public String test(String value) {
                return "create fallback: " + value;
            }
        };
    }

}
