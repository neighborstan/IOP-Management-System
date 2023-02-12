package art.evalevi.multimodule.productservice.repository;

import art.evalevi.multimodule.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
