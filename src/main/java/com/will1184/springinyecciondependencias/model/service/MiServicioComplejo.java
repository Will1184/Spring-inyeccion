package com.will1184.springinyecciondependencias.model.service;

public class MiServicioComplejo implements IService {
    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante complicado ...";
    }
}
