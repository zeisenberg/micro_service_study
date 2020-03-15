package com.szkingdom.product.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author zhaizhengwei
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {

        return "this is 'product' message";
    }
}