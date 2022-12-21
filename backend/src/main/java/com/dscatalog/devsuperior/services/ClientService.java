package com.dscatalog.devsuperior.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dscatalog.devsuperior.dto.ClientDTO;
import com.dscatalog.devsuperior.entities.Client;
import com.dscatalog.devsuperior.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		List<ClientDTO> listDto = new ArrayList<>();
		for(Client cli : list) {
			listDto.add(new ClientDTO(cli));
		}
		return listDto;
	}
}
