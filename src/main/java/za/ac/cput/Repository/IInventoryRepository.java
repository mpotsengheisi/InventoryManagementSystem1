package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Inventory;

@Repository
public interface IInventoryRepository extends JpaRepository<Inventory, Integer> {

    Inventory create(Inventory inventory);

    Inventory read(Long id);

    Inventory update(Inventory inventory);

    boolean delete(Long id);

}
