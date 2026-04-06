package com.example.Antvengers.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Antvengers.modelos.MedioPago;

@Repository

public interface IMedioPagoRepositorio extends JpaRepository <MedioPago, Integer>{

    
}
