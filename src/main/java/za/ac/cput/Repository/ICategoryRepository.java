package za.ac.cput.Repository;

/*
 * ICategoryRepository.java
 * JPA Repository interface for Category
 * Author: Ahluma Nkqayi (222512571)
 * Date: 24 May 2025
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, String> {

}
