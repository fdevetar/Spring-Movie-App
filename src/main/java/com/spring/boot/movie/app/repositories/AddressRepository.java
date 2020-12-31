package com.spring.boot.movie.app.repositories;

import com.spring.boot.movie.app.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
