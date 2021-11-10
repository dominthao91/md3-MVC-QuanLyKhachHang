package mvc.service;

import mvc.model.Customer;
import mvc.service.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Tuấn Chó", "tuancho@codegym.vn", "Hải Phòng"));
        customers.put(2, new Customer(2, "Đinh BD", "bd@codegym.vn", "Tây Hồ"));
        customers.put(3, new Customer(3, "Long Gấu", "longau@codegym.vn", "Hà Đông"));
        customers.put(4, new Customer(4, "Cường Con", "concon@codegym.vn", "Thái Nguyên"));
        customers.put(5, new Customer(5, "CODE", "code@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "GYM", "gym@codegym.vn", "Newyork"));
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
