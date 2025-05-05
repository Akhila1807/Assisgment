package org.example.assignment.service;


import org.example.assignment.Item;

import java.util.List;

public abstract class ItemService {
    public abstract List<Item> getAllItems();
    public abstract Item saveItem(Item item);
}
