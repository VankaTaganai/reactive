package am.panov.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import am.panov.models.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> { }
