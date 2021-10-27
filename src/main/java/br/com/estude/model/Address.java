package br.com.estude.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Integer idAddress;
    private String street;
    private String city;
    private String state;
    private Integer zipCode;
    private String Country;    
    //integer idStudent
}
