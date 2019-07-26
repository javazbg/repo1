package com.itheima.service.impl;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zbg
 * @date : 2019-07-25
 * @date : 10:03
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    public Items findById(Integer id) {
        Items byId = itemsMapper.findById(id);
        return byId;
    }

    public List<Items> findAll() {
        return itemsMapper.findAll();
    }
}
