package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.ClientDTO;
import org.example.entity.Client;
import org.example.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientRepository clientRepository;
    public Client create(ClientDTO dto) {
        Client client = Client.builder().
                name(dto.getName()).
                age(dto.getAge()).
                build();
        return clientRepository.save(client);
    }
    public List<Client> readAll() {
      return clientRepository.findAll();
    }
    public Client update(Client client) {
        return clientRepository.save(client);
    }
   public void delete(int id) {
        clientRepository.deleteById(id);
   }
}
