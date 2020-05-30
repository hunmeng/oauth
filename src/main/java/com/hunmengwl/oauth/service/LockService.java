package com.hunmengwl.oauth.service;

import com.hunmengwl.oauth.entity.LockEntity;
import com.hunmengwl.oauth.entity.ResultEntity;
import com.hunmengwl.oauth.repository.LockRepository;
import com.hunmengwl.oauth.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hunmeng
 */
@Service
public class LockService {

    @Autowired
    private LockRepository lockRepository;

    @Autowired
    private ResultRepository resultRepository;

    public String oauthLock(String value){
        List<LockEntity> byValue = lockRepository.findByValue(value);
        ResultEntity resultEntity = resultRepository.findAll().get(0);
        if (byValue == null || byValue.size() <= 0) {
            return resultEntity.getFail();
        }
        return resultEntity.getSucceed();
    }



}
