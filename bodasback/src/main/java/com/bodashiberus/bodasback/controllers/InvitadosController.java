package com.bodashiberus.bodasback.controllers;

import com.bodashiberus.bodasback.dto.InvitadoDto;
import com.bodashiberus.bodasback.dto.MensajeInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/invitados")
public class InvitadosController {
    
    @PostMapping
    public void insertar(MensajeInfo mensaje){
        System.out.println("Nuevo invitado " + mensaje.getData());
    }
    
}
