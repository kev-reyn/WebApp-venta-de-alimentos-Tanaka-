package com.example.tanaka.Service;

import com.example.tanaka.Repository.PlatilloRepository;
import com.example.tanaka.models.Platillo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatilloService {
    @Autowired
    private PlatilloRepository platilloRepository;

    public List<Platillo> getAllPlatillos(){
        return platilloRepository.findAll();
    }
    public List<Platillo> getPlatilloById(Long id){
        Optional<Platillo> platilloOptional = platilloRepository.findById(id);
        return (List<Platillo>) platilloOptional.orElse(null);
    }


}
