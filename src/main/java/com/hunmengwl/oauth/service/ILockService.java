package com.hunmengwl.oauth.service;

/**
 * @author hunmeng
 * 接口
 */
public interface ILockService {

    /**
     * 验证是否存在
     * @param value
     * @return
     */
    String oauthLock(String value);
}
