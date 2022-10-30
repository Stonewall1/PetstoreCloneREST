package com.example.petstoreclone.service;

import com.example.petstoreclone.entity.Pet;
import com.example.petstoreclone.repository.PetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet save(Pet pet) {
        petRepository.save(pet);
        return pet;
    }

    public Pet update(Pet pet) {
        return petRepository.save(pet);
    }

    @Transactional(readOnly = true)
    public List<Pet> findAllByStatus(String status) {
        return petRepository.findByStatus(status);
    }
    public Optional<Pet> findById(long id){
        return petRepository.findById(id);
    }
}
