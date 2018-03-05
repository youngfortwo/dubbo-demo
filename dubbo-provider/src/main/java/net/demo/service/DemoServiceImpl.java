package net.demo.service;

import net.demo.api.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by yc on 2018/3/3.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        return name;
    }
}
