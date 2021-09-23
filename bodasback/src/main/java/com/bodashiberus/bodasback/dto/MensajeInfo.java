
package com.bodashiberus.bodasback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MensajeInfo {
    private String id;
    private String accion;
    private InvitadoDto data;
}
