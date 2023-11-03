package com.example.tanaka.Controller;

import com.example.tanaka.Service.PlatilloService;
import com.example.tanaka.models.Platillo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/platillos")
public class PlatilloController {
    @Autowired
    private PlatilloService platilloService;

    @GetMapping
    public List<Platillo> getAllPlatillosById(){
        return platilloService.getAllPlatillos();
    }

}
