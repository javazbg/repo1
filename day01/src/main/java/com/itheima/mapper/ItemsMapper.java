package com.itheima.mapper;


import com.itheima.domain.Items;

import java.util.List;

/**
 * @author : zbg
 * @date : 2019-07-24
 * @date : 15:39
 */
public interface ItemsMapper {

    public Items findById(Integer id);

    public List<Items> findAll();

}
