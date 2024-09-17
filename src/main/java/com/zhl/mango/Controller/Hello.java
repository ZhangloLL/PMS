package com.zhl.mango.Controller;

import com.zhl.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhl
 * @date 2024/09/06 19:36
 **/

@RestController
public class Hello {

    @Autowired
    SysUserService sysUserService;

    @GetMapping("hello")
    private String hello(){

        return "hello 真的服了";
    }

    @GetMapping("findAll")
    private Object findAll(){
        return sysUserService.findAll();
    }
}
