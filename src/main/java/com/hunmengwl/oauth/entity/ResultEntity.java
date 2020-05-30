package com.hunmengwl.oauth.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hunmeng
 */
@Entity
@Data
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "succeed")
    private String succeed;

    @Column(name = "fail")
    private String fail;

}
