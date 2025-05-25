package za.ac.cput.Repository;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import za.ac.cput.Domain.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class InventoryRepository implements IInventoryRepository {

    private static IInventoryRepository repository;
    private List<Inventory> inventoryList;

    private InventoryRepository() {
        inventoryList = new ArrayList<>();
    }

    public static IInventoryRepository getRepository() {
        if (repository == null) {
            repository = new InventoryRepository();
        }
        return repository;
    }


    @Override
    public Inventory create(Inventory inventory) {
        inventoryList.add(inventory);
        return inventory;
    }

    @Override
    public Inventory read(Long id) {
        return null;
    }

    @Override
    public Inventory update(Inventory inventory) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Inventory> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Inventory> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Inventory> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Inventory getOne(Integer integer) {
        return null;
    }

    @Override
    public Inventory getById(Integer integer) {
        return null;
    }

    @Override
    public Inventory getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Inventory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Inventory> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Inventory> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Inventory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Inventory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Inventory> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Inventory, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Inventory> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Inventory> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Inventory> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Inventory> findAll() {
        return List.of();
    }

    @Override
    public List<Inventory> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Inventory entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Inventory> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Inventory> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Inventory> findAll(Pageable pageable) {
        return null;
    }
}
