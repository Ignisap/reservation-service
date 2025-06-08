package com.ignisage.reservation_service.client;

import com.ignisage.reservation_service.client.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.UUID;

@FeignClient(name = "user-service", url = "http://localhost:8081/api/user")
public interface UserClient {
    @GetMapping("/{id}")
    UserDTO getUser(@PathVariable UUID id, @RequestHeader("Authorization") String token);

}
