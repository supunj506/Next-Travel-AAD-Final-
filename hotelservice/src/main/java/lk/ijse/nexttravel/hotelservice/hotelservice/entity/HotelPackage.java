/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 2:09 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "hotelPackage")
public class HotelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private
    String hp_id;
    @Column(nullable = false)
    private
    String hp_category;
    @Column(nullable = false)
    private
    double hp_price;


}
