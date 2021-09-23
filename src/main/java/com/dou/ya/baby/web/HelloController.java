package com.dou.ya.baby.web;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wujb
 * @date ：Created in 2021/9/23
 * @description：${description}
 */
@RestController
public class HelloController {

    /**
     * Hello，World
     *
     */
    @GetMapping("/hello")
    public String sayHello() {

        return StrUtil.format("Hello, {}!", "豆芽");
    }
}
