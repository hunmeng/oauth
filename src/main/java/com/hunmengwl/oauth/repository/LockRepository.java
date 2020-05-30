package com.hunmengwl.oauth.repository;

import com.hunmengwl.oauth.entity.LockEntity;
import com.hunmengwl.oauth.entity.ResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hunemng
 */
@Repository
public interface LockRepository extends JpaRepository<LockEntity,Long> {

    /**
     * 根据value值查询
     * @param value
     * @return
     */
    List<LockEntity> findByValue(String value);

}
