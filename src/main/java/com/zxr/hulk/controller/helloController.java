package com.zxr.hulk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@Api("helloWorld")
@Log4j2
public class helloController {

    @GetMapping(value = "/world")
    @ApiOperation("hello world")
    public String helloWorld(){
        System.out.println("sdfsfsdsssssssssss");
        return "hello world";
    }

}
