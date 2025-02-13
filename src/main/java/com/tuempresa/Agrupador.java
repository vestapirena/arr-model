package com.tuempresa;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Representa un agrupador con clave y descripción")
public class Agrupador {

    @ApiModelProperty(value = "Clave única del agrupador")
    @JsonProperty("cve_agrupador")
    private Integer cveAgrupador;

    @ApiModelProperty(value = "Descripción del agrupador")
    @JsonProperty("des_agrupador")
    private String desAgrupador;

    // Constructor vacío
    public Agrupador() {}

    // Constructor con parámetros
    public Agrupador(Integer cveAgrupador, String desAgrupador) {
        this.cveAgrupador = cveAgrupador;
        this.desAgrupador = desAgrupador;
    }

    // Getters y Setters
    public Integer getCveAgrupador() {
        return cveAgrupador;
    }

    public void setCveAgrupador(Integer cveAgrupador) {
        this.cveAgrupador = cveAgrupador;
    }

    public String getDesAgrupador() {
        return desAgrupador;
    }

    public void setDesAgrupador(String desAgrupador) {
        this.desAgrupador = desAgrupador;
    }

    @Override
    public String toString() {
        return "Agrupador{" +
                "cveAgrupador=" + cveAgrupador +
                ", desAgrupador='" + desAgrupador + '\'' +
                '}';
    }
}
