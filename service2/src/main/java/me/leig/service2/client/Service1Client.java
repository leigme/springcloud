package me.leig.service2.client;

import me.leig.service2.client.fallback.factory.Service1FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author leig
 */


@FeignClient(name = "service1", fallbackFactory = Service1FallbackFactory.class)
public interface Service1Client {

    @RequestMapping(method = RequestMethod.GET, path = "/test/{value}")
    String test(@PathVariable("value") String value);

}
