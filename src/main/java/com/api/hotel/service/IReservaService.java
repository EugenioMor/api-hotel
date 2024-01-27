package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.model.Reserva;

import java.util.List;

public interface IReservaService {

    //Listar todas las reservas
    public List<Reserva> getAllReservas();

    //Buscar una reserva por su ID
    public Reserva findReserva(Long id);

    //Crear una reserva
    public Reserva createReserva(Reserva reserva);

    //Editar una reserva
    public Reserva updateReserva(Reserva reserva);

    //Eliminar reserva
    public void deleteReservaById(Long id);
}
