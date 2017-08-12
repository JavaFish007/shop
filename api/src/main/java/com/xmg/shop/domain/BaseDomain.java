package com.xmg.shop.domain;

import java.io.Serializable;

/**
 *
 * Created by Administrator on 2017/8/11 0011.
 */
public class BaseDomain implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
