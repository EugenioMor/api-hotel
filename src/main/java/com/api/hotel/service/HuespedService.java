package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.repository.IHuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService implements IHuespedService{

    @Autowired
    private IHuespedRepository huespedRepository;


    @Override
    public List<Huesped> getAllHuespedes() {
        return huespedRepository.findAll();
    }

    @Override
    public Huesped findHuesped(Long id) {
        return huespedRepository.findById(id).orElse(null);
    }

    @Override
    public Huesped createHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    @Override
    public Huesped updateHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    @Override
    public void deleteHuespedById(Long id) {
        huespedRepository.deleteById(id);
    }
}
