package org.example.assignment.service1.impl;

import org.example.assignment.repository.ItemRepository;
import org.example.assignment.Item;
import org.example.assignment.Item;  // ✅ Correct
import org.example.assignment.service.ItemService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemServiceImpl extends ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
}

