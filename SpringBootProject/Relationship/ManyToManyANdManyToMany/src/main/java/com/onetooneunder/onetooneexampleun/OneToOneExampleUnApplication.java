package com.onetooneunder.onetooneexampleun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneExampleUnApplication  implements CommandLineRunner {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(OneToOneExampleUnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer=new Customer("Tom");
        Item item=new Item("Brush");
        Item item2=new Item("Burse");

        customer.getItem().add(item);
        customer.getItem().add(item2);
//        item.setCustomer(customer);
//        item.setCustomer(customer);

        repository.save(customer);

    }
}
