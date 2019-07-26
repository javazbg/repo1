package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : zbg
 * @date : 2019-07-25
 * @date : 09:24
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public String findById(Model model){
        Items byId = itemsService.findById(1);
        model.addAttribute("item",byId);
        return "itemDetail";
    }

    @RequestMapping(value = "/findAll",produces = "text/html; charset=utf-8")
    @ResponseBody
    public String findAll(){
        List<Items> all = itemsService.findAll();
        for (Items items : all) {
            System.out.println(items);
        }
        return "不厚道呀！！！"+all;
    }

}
