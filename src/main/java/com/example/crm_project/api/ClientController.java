package com.example.crm_project.api;


import com.example.crm_project.buisness.ClientService;
import com.example.crm_project.dao.Client;
import com.example.crm_project.dao.Order;
import com.example.crm_project.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ClientController {
 @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<ClientDTO> getClients(){
        return clientService.getClients();
    }

    @GetMapping("client/{id}")
    public ResponseEntity getClientById(@PathVariable Integer id){
        Optional<Client> optional=  clientService.getOneClient(id);
        if(optional.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            Client client= optional.get();
            return ResponseEntity.ok(client);
        }
    }

    @PostMapping("client")
    public void createClient(@RequestBody Client client){
        clientService.createClient(client);
    }

    @DeleteMapping("client/{id}")
    public  ResponseEntity deleteById(@PathVariable Integer id){
        Optional<Client> optional = clientService.getOneClient(id);
        if(optional.isPresent()){
            clientService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }

    }

    @PutMapping("client/{id}")
    public ResponseEntity update(@PathVariable Integer id, @RequestBody Client client){


        Optional<Client> op = clientService.getOneClient(id);
        if(id != client.getId()){
            return ResponseEntity.notFound().build();
        } else if (op.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            clientService.update(client);
            return ResponseEntity.ok().build();
        }
    }


}
