package com.ugb.tiendaproductosonline;

import java.util.Base64;
public class utilidades {
    //ipconfig para revisar la direccion de la maquina, puede cambiar
    static String urlConsulta = "http://192.168.104.177:5984/gilberto/_design/nahun/_view/nahun";
    static String urlMto = "http://192.168.104.177:5984/gilberto";
    static String user = "admin";
    static String passwd = "Naquiel7472";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}

/*
  "_id": "2feca9ea7aed3d28830f7e20c00502c3",
  "_rev": "1-91b35a5fcee8238d634090e5537fabb4",
  "idProducto": "",
  "codigo": "MK-32",
  "nombre": "Peluche",
  "marca": "Peluchiis",
  "costo": "34",
  "stock": "2",
  "ganancia": "6",
  "descripcion": "lorem imsup",
  "imgproducto": ""
 */