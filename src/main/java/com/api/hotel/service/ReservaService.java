package com.api.hotel.service;

import com.api.hotel.model.Reserva;
import com.api.hotel.repository.IReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService implements IReservaService{

    @Autowired
    private IReservaRepository reservaRepository;


    @Override
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva findReserva(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public void deleteReservaById(Long id) {
        reservaRepository.deleteById(id);
    }
}
