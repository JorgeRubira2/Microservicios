/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodashiberus.bodasfront.controllers;

import com.bodashiberus.bodasfront.config.RabbitConfig;
import com.bodashiberus.bodasfront.dto.MensajeInfo;
import com.bodashiberus.bodasfront.dto.PersonaDto;
import com.bodashiberus.bodasfront.feign.InvitacionesFeign;
import java.util.UUID;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BodasController {
    
    @Autowired
    private InvitacionesFeign invFeign;
    
    @Autowired
    private RabbitTemplate rabbitMQ;
    
    @GetMapping("/invitaciones")
    public String mostrarInvitaciones(){
        return "formInvitaciones";
    }
    
    @PostMapping("/invitarMQ")
    public String invitarMQ(PersonaDto persona){
        MensajeInfo mensaje=new MensajeInfo(
                UUID.randomUUID().toString(),
                "invitar",
                persona
        );
        rabbitMQ.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.BINDING, mensaje);
        return "redirect:/invitaciones";
    }    


    @PostMapping("/invitar")
    public String invitar(PersonaDto persona){
        //Haremos la invitacion
        invFeign.invitar(persona.getNombre(),
                        persona.getMesa(),
                        persona.getSalon());
        return "redirect:/invitaciones";
    }
    
}
