package com.hunmengwl.oauth.controller;

import com.hunmengwl.oauth.service.LockService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hunmeng
 */
@RestController
@Log4j2
public class LockController {

    @Autowired
    private LockService lockService;

    @RequestMapping("/lock")
    public String lock(String user) {
        String result = "";
        try {
            result = lockService.oauthLock(user);
            return result;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }


}
