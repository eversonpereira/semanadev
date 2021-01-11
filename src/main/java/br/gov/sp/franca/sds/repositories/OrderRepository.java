package br.gov.sp.franca.sds.repositories;

import br.gov.sp.franca.sds.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
