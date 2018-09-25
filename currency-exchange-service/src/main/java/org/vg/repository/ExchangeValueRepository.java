package org.vg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vg.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByFromAndTo(String from, String to);
}
