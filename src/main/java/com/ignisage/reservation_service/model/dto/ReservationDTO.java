package com.ignisage.reservation_service.model.dto;

import com.ignisage.reservation_service.client.dto.UserDTO;
import com.ignisage.reservation_service.model.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {
    private Reservation reservation;
    private UserDTO userDTO;
}
