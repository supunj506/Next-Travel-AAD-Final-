/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 3:04 PM
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
public class HotelPackageDTO implements Serializable {

    String hp_id;
    String hp_category;
    double hp_price;
    String h_id;

    public HotelPackageDTO(String hp_category, double hp_price, String h_id) {
        this.hp_category = hp_category;
        this.hp_price = hp_price;
        this.h_id = h_id;
    }

    public HotelPackageDTO(String hp_id, double hp_price) {
        this.hp_id = hp_id;
        this.hp_price = hp_price;
    }
}
