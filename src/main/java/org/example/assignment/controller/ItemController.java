package org.example.assignment.controller;


import org.example.assignment.Item;
import org.example.assignment.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        model.addAttribute("item", new Item());
        return "index";
    }

    @PostMapping("/add")
    public String addItem(@ModelAttribute Item item) {
        itemService.saveItem(item);
        return "redirect:/";
    }
}

