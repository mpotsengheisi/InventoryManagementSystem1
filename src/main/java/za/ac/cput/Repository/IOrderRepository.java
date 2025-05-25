package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Order;
import java.util.List;


@Repository
public interface IOrderRepository extends JpaRepository<Order, String> {
    Order create(Order order);
    Order read(String id);
    Order update(Order order);
    Order update(String id, Order order);
    boolean delete(String id);
    List<Order> getAll();
    List<Order> findByCustomerId(String customerId);
}

