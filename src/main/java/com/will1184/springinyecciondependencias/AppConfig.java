package com.will1184.springinyecciondependencias;

import com.will1184.springinyecciondependencias.model.domain.ItemFactura;
import com.will1184.springinyecciondependencias.model.domain.Producto;
import com.will1184.springinyecciondependencias.model.service.IService;
import com.will1184.springinyecciondependencias.model.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("miServicioSimple")
    @Primary
    public IService registrarMiServicio(){
        return  new MiServicio();
    }
    @Bean("miServicioComplejo")
    public IService registrarMiServicioComplejo(){
        return  new MiServicio();
    }
    @Bean("itemsFactura")
public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Sony",100);
        Producto producto2 = new Producto("Bicicleta Bianchi aro 26",200);

        ItemFactura linea1 = new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2,4);
        return Arrays.asList(linea1,linea2);
    }
    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura>registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG LCD 24",250);
        Producto producto2 = new Producto("Notebook Asus",500);
        Producto producto3 = new Producto("Impresora HP Multifuncional",80);
        Producto producto4 = new Producto("Escritorio de oficina",300);

        ItemFactura linea1 = new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2,1);
        ItemFactura linea3 = new ItemFactura(producto3,1);
        ItemFactura linea4 = new ItemFactura(producto4,1);
        return Arrays.asList(linea1,linea2,linea3,linea4);
    }
}
