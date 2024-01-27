package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import java.util.List;

public interface IHuespedService {

    //Listar todos los huéspedes
    public List<Huesped> getAllHuespedes();

    //Buscar un huésped por su ID
    public Huesped findHuesped(Long id);

    //Crear un huésped
    public Huesped createHuesped(Huesped huesped);

    //Editar un huésped
    public Huesped updateHuesped(Huesped huesped);

    //Eliminar huésped
    public void deleteHuespedById(Long id);
}
