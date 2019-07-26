package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

/**
 * @author : zbg
 * @date : 2019-07-25
 * @date : 10:02
 */
public interface ItemsService {
    public Items findById(Integer id);

    public List<Items> findAll();
}
