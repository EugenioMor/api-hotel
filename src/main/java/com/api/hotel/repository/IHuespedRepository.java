package com.api.hotel.repository;

import com.api.hotel.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHuespedRepository extends JpaRepository<Huesped, Long> {
}
