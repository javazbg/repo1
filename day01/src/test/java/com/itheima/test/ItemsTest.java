package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.domain.Items;
import com.itheima.mapper.AccountMapper;
import com.itheima.mapper.ItemsMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author : zbg
 * @date : 2019-07-24
 * @date : 15:53
 */
public class ItemsTest {
    @Test
    public void show1(){
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = cs.getBean(ItemsMapper.class);
        Items byId = itemsMapper.findById(1);
        System.out.println(byId);
    }

    @Test
    public void show2(){
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = cs.getBean(ItemsMapper.class);
        List<Items> all = itemsMapper.findAll();
        System.out.println(all);
    }


    @Test
    public void show3(){
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountMapper bean = cs.getBean(AccountMapper.class);
        List<Account> all = bean.findAll();
        System.out.println(all);
    }

}
