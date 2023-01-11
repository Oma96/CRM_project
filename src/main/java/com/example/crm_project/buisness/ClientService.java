package com.example.crm_project.buisness;

import com.example.crm_project.dao.Client;
import com.example.crm_project.dao.ClientRepository;
import com.example.crm_project.dao.Order;
import com.example.crm_project.dao.OrderRepository;
import com.example.crm_project.dto.ClientDTO;
import com.example.crm_project.dto.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientDTO> getClients(){
        List<ClientDTO> dtos= new ArrayList<>();
        List<Client> clients= clientRepository.findAll();
        clients.forEach(el->dtos.add(ClientMapper.fromEntity(el)));
        return dtos;
    }

    public Optional<Client> getOneClient(Integer id){
        return clientRepository.findById(id);
    }

    public void createClient(Client client){
        clientRepository.save(client);
    }

    public void deleteById(Integer id){
        clientRepository.deleteById(id);
    }


    public void update(Client client){
        clientRepository.save(client);
    }

}


