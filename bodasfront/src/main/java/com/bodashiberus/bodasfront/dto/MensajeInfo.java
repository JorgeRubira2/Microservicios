/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodashiberus.bodasfront.dto;

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
    private Object data;
}