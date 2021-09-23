package com.bodashiberus.bodasfront.feign;

import com.bodashiberus.bodasfront.dto.PersonaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name="Bodasback3", url="http://localhost:8082")
@FeignClient(name="BodasBack", url="http://localhost:8082")
@RequestMapping("/v1/invitados")
public interface InvitacionesFeign {
    
    @PostMapping
    public void invitar(@RequestParam String nombre, 
                        @RequestParam Integer mesa,
                        @RequestParam Integer salon);    
}
