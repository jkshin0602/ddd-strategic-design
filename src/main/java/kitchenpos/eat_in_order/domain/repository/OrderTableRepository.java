package kitchenpos.eat_in_order.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import kitchenpos.eat_in_order.domain.OrderTable;

public interface OrderTableRepository {
    OrderTable save(OrderTable orderTable);

    Optional<OrderTable> findById(UUID id);

    List<OrderTable> findAll();
}

