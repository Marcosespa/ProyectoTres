package   com.example.mdbspringboot.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="puntos_atencion")
@ToString
public class PuntoAtencion {
  @Id
  private Integer id;

  private String tipo;

  private String ciudad;

  private String horario_atencion;

  private String direccion;


  public PuntoAtencion() {
    ;
  }

  public PuntoAtencion(String tipo, String ciudad, String horario_atencion, String direccion) {
    this.tipo = tipo;
    this.ciudad = ciudad;
    this.horario_atencion = horario_atencion;
    this.direccion = direccion;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getHorario_atencion() {
    return horario_atencion;
  }

  public void setHorario_atencion(String horario_atencion) {
    this.horario_atencion = horario_atencion;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

}
