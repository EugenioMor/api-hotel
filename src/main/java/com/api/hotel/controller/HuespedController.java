package com.api.hotel.controller;

import com.api.hotel.model.Huesped;
import com.api.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/huespedes")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    @GetMapping
    public List<Huesped> listarTodos(){
        return huespedService.getAllHuespedes();
    }

    @GetMapping("/{id}")
    public Huesped getHuespedById(@PathVariable Long id){
        return huespedService.findHuesped(id);
    }

    @PostMapping("/create")
    public Huesped crearHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    @PutMapping("/edit/{id}")
    public Huesped actualizarHuesped(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminarHuesped(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
}
