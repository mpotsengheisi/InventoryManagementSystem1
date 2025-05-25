package za.ac.cput.Repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import za.ac.cput.Domain.Order;
import java.util.*;
import java.util.function.Function;


public class OrderRepository implements IOrderRepository{

    private static IOrderRepository instance;
    private static OrderRepository repository;

    private List<Order> orderList;

    private OrderRepository() {
        orderList = new ArrayList<>();

    }

    public static OrderRepository getRepository() {
        if (repository == null) {
            repository = new OrderRepository();
        }
        return repository;
    }


    @Override
    public Order create(Order order) {
        orderList.add(order);
        return order;
    }

    @Override
    public Order read(String id) {
        for (Order order : orderList) {
            if (order.getOrderId().equals(id)) {
                return order;
            }
        }
        return null; // Return null if no order is found
    }

    @Override
    public Order update(Order order) {
        for (int i = 0; i < orderList.size(); i++) {
            Order o = orderList.get(i);
            if (o.getOrderId().equals(order.getOrderId())) {
                orderList.set(i, order); // Update the order at the found index
                return order;
            }
        }
        return null; // Return null if no order is found to update

    }

    @Override
    public Order update(String id, Order order) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        for (Order order : orderList) {
            if (order.getOrderId().equals(id)) {
                orderList.remove(order);
                return true;
            }
        }
        return false; // Return false if no order is found to delete
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }

    @Override
    public List<Order> findByCustomerId(String customerId) {
        return List.of();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Order> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Order> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Order getOne(String s) {
        return null;
    }

    @Override
    public Order getById(String s) {
        return null;
    }

    @Override
    public Order getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Order> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Order> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Order> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Order> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Order, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Order> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Order> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Order> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }

    @Override
    public List<Order> findAllById(Iterable<String> strings) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Order entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Order> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Order> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Order> findAll(Pageable pageable) {
        return null;
    }
}