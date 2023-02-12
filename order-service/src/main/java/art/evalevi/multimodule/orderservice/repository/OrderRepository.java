package art.evalevi.multimodule.orderservice.repository;

import art.evalevi.multimodule.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
