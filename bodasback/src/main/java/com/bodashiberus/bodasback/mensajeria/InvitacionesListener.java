package com.bodashiberus.bodasback.mensajeria;

import com.bodashiberus.bodasback.config.RabbitConfig;
import com.bodashiberus.bodasback.dto.InvitadoDto;
import com.bodashiberus.bodasback.dto.MensajeInfo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InvitacionesListener {
    
    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void recibirInvitaciones(MensajeInfo mensaje){
        System.out.println("Recibido mensaje " + mensaje);
    }
    
}
