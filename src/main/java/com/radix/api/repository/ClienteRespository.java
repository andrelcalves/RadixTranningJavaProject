package com.radix.api.repository;


import org.springframework.data.repository.CrudRepository;
import com.radix.api.entities.Cliente;

//This will be AUTO IMPLEMENTED by Spring into a Bean called ClienteRepository
//CRUD refers Create, Read, Update, Delete

public interface ClienteRespository extends CrudRepository<Cliente, Integer> {

	public Cliente findByCnpj(String Cnpj);
}
