package com.example.crm_project.dto;

import com.example.crm_project.buisness.ClientState;
import com.example.crm_project.dao.Client;

public class ClientMapper {

    public static ClientDTO fromEntity(Client client){

         ClientDTO dto = new ClientDTO();

         dto.setCompanyName(client.getCompanyName());
         dto.setFirstName(client.getFirstName());
         dto.setLastName(client.getLastName());
         dto.setEmail(client.getEmail());
         dto.setPhone(client.getPhone());
         dto.setAddress(client.getAddress());
         dto.setZipCode(client.getZipCode());
         dto.setCity(client.getCity());
         dto.setCountry(client.getCountry());

         if(client.getState()==0){
             dto.setState(ClientState.INACTIVE);
         }else{
           dto.setState(ClientState.ACTIVE);
         }

        return dto;
    }



    public static Client toEntity(ClientDTO dto){

        Client client = new Client();

        client.setCompanyName(dto.getCompanyName());
        client.setFirstName(dto.getFirstName());
        client.setLastName(dto.getLastName());
        client.setEmail(dto.getEmail());
        client.setPhone(dto.getPhone());
        client.setAddress(dto.getAddress());
        client.setZipCode(dto.getZipCode());
        client.setCity(dto.getCity());
        client.setCountry(dto.getCountry());

        if(dto.getState()==ClientState.INACTIVE){
            client.setState(0);
        }else{
            client.setState(1);
        }

        return client;
    }


}
