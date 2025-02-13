package com.tuempresa;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        try {
            // Crear una instancia del DTO
            Agrupador agrupador = new Agrupador(1, "Descripción del Agrupador");

            // Convertir el objeto a JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(agrupador);

            // Imprimir el JSON
            System.out.println("Objeto convertido a JSON: " + json);

            // Leer el JSON de vuelta a un objeto
            Agrupador nuevoAgrupador = objectMapper.readValue(json, Agrupador.class);
            System.out.println("JSON convertido de nuevo a objeto: " + nuevoAgrupador);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
