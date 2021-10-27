package br.com.estude.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter//criando metodo Get com Lombok para todos os atributos da classe
@Setter//criando metodo Set com Lombok para todos os atributos da classe
@AllArgsConstructor//Metodo Construtor da classe com lombok
@NoArgsConstructor //Construtor vazio
public class User {

    private Integer idUser;
    private String user;
    private String password;
    //integer idStudent
    
}
