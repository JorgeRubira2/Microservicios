
package com.bodashiberus.bodasback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InvitadoDto {
    private String nombre;
    private Integer mesa;
    private Integer salon;
}
