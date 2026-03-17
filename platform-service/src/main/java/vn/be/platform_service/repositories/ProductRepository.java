package vn.be.platform_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.be.platform_service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
