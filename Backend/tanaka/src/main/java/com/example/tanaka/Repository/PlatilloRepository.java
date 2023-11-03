package com.example.tanaka.Repository;

import com.example.tanaka.models.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatilloRepository extends JpaRepository<Platillo, Long> {

}
