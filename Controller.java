package controller;

import domain.Item;
import repository.IRepository;
import repository.Repository;

public class Controller {

    private IRepository repository;

    public Controller(
            IRepository respository
    )

    {
        this.repository = respository;
    }

    public Item[] filterbyweight(int filteredValue){
        Item[] items = repository.getAll();
        Item[] filteredItems = new Item[Repository.ARRAY_SIZE];
        int currentPosition = 0;
        for (int i = 0; i < this.repository.getCurrentIndex(); i++) {

            if(items[i].getWeight()>filteredValue){
                filteredItems[currentPosition] = items[i];
               currentPosition+=1;
            }
        }
        return filteredItems;
    }
}
