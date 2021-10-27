package br.com.estude.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter//criando metodo Get com Lombok para todos os atributos da classe
@Setter//criando metodo Set com Lombok para todos os atributos da classe
@AllArgsConstructor //Metodo Construtor da classe com lombok
@NoArgsConstructor //Construtor vazio
public class Student {

    private Integer idStudent;
    private String name;
    private int age;
    private String email;
        
    //Integer isAddress;
    //Integer idUser;
    //List <User>;
    //List <Address>;

}
