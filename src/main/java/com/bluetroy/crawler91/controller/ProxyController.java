package com.bluetroy.crawler91.controller;

import com.bluetroy.crawler91.service.ProxyService;
import com.bluetroy.crawler91.vo.ProxyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: heyixin
 * Date: 2018-11-07
 * Time: 5:23 PM
 */
@RestController
@RequestMapping("/proxy")
public class ProxyController {
    @Autowired
    private ProxyService proxyService;

    @PatchMapping
    public void setProxy(@RequestBody @Valid ProxyInfo proxyInfo) {
        proxyService.setProxy(proxyInfo);
    }
}
