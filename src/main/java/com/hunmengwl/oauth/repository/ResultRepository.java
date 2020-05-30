package com.hunmengwl.oauth.repository;

import com.hunmengwl.oauth.entity.ResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hunmeng
 */
@Repository
public interface ResultRepository extends JpaRepository<ResultEntity,Long> {

}
