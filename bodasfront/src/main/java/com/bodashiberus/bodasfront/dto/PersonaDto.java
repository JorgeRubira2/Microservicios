
package com.bodashiberus.bodasfront.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto {
    private String nombre;
    private Integer mesa;
    private Integer salon;
}
