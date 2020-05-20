package com.moses.config;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Moses
 * @date 2020/5/8
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     * 创建用户id
     */
    @Column(updatable = false)
    private String createUserId;
    /**
     * 创建日期
     */
    @Column(updatable = false)
    private Date createDate;
    /**
     * 更新用户id
     */
    @Column
    private String modifyUserId;
    /**
     * 更新日期
     */
    @Column
    private Date modifyDate;
}
