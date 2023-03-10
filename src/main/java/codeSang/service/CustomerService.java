package codeSang.service;


import codeSang.models.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{
    private static final Map<Integer, Customer> customers ;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "hoa", "hoa@gmail", "hn"));
        customers.put(2, new Customer(2, "lan", "hoa@gmail", "bn"));
        customers.put(3, new Customer(3, "hong", "hoa2@gmail", "vn"));
        customers.put(4, new Customer(4, "cuc", "hoa3@gmail", "hy"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
