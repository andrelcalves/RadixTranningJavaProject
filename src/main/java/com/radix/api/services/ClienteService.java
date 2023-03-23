package com.radix.api.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radix.api.entities.Cliente;
import com.radix.api.repository.ClienteRespository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRespository clienteRepo;
	
	public void inserirCliente() {
		Cliente clienteAmericanas = new Cliente();
		clienteAmericanas.setCnpj("225399497000135");
		clienteAmericanas.setRazaoSocial("Americanas S.A");
		clienteAmericanas.setDataCriacao(new Date());
		clienteAmericanas.setDataAtualizacao(new Date());
		
		clienteRepo.save(clienteAmericanas);
		
		Cliente clienteMagalu = new Cliente();
		clienteMagalu.setCnpj("2553992270001236");
		clienteMagalu.setRazaoSocial("Magazine Luiza S.A");
		clienteMagalu.setDataCriacao(new Date());
		clienteMagalu.setDataAtualizacao(new Date());
		
		clienteRepo.save(clienteMagalu);
			
	}
	
	public void clienteTodos() {
		Iterable<Cliente> cl = clienteRepo.findAll();
		cl.forEach((c)->{
			System.out.println(c.getId());
			System.out.println(c.getCnpj());
			System.out.println(c.getRazaoSocial());
			
		});
	}
	
	public void clientePorCNPJ() {
		Cliente clienteMag = new Cliente(); 
		clienteMag = clienteRepo.findByCnpj("2553992270001236");
		System.out.println("Consulta por CNPJ");
		System.out.println(clienteMag.getRazaoSocial());
	}
}