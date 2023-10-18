/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:00 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelDTO implements Serializable {
    String h_id;
    String h_name;
    String h_category;
    String h_starRate;
    String h_location;
    String h_map;
    String h_email;
    String h_contact01;
    String h_contact02;
    String h_petStatus;
    String h_cancellation;

    public HotelDTO(String h_name, String h_category, String h_starRate, String h_location, String h_map, String h_email, String h_contact01, String h_contact02, String h_petStatus, String h_cancellation) {
        this.h_name = h_name;
        this.h_category = h_category;
        this.h_starRate = h_starRate;
        this.h_location = h_location;
        this.h_map = h_map;
        this.h_email = h_email;
        this.h_contact01 = h_contact01;
        this.h_contact02 = h_contact02;
        this.h_petStatus = h_petStatus;
        this.h_cancellation = h_cancellation;
    }
}
