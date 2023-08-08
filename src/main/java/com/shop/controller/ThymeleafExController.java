package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafExController {
    @GetMapping("/ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data", "example of thymeleaf");
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping("/ex02")
    public String thymeleafExample02(Model model){
        ItemDto itemDto = new ItemDto();
        itemDto.setItemDetail("product's details");
        itemDto.setItemName("test1");
        itemDto.setPrice(10000);
        itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto", itemDto);
        return "thymeleafEx/thymeleafEx02";
    }

    @GetMapping("/ex03")
    public String thymeleafExample03(Model model){
        ArrayList<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("product's details"+i);
            itemDto.setItemName("test"+i);
            itemDto.setPrice(10000+i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx03";
    }

    @GetMapping("/ex04")
    public String thymeleafExample04(Model model){
        ArrayList<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("product's details"+i);
            itemDto.setItemName("test"+i);
            itemDto.setPrice(10000+i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx04";
    }

    @GetMapping("/ex05")
    public String thymeleafExample05(Model model){
        ArrayList<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("product's details"+i);
            itemDto.setItemName("test"+i);
            itemDto.setPrice(10000+i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx05";
    }

    @GetMapping("/ex06")
    public String thymeleafExample06(){
        return "thymeleafEx/thymeleafEx06";
    }

    @GetMapping("/ex07")
    public String thymeleafExample07(String param1, String param2, Model model){
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "thymeleafEx/thymeleafEx07";
    }

    @GetMapping("/ex08")
    public String thymeleafExample08(){
        return "thymeleafEx/thymeleafEx08";
    }
}
