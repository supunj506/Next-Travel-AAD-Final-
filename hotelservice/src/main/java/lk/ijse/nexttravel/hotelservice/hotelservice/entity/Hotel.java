/*
 * Author  : supun@mj
 * Project : Spring Boot Final Project
 * Date    : 10/18/2023
 * Time    : 1:56 PM
 * For GDSE course of IJSE Institute.
 */

package lk.ijse.nexttravel.hotelservice.hotelservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private
    String h_id;
    @Column(nullable = false)
    private
    String h_name;
    @Column(nullable = false)
    private
    String h_starRate;
    @Column(nullable = false)
    private
    String h_location;
    @Column(nullable = false)
    private
    String h_map;
    @Column(nullable = false)
    private
    String h_email;
    @Column(nullable = false)
    private
    String h_contact01;
    @Column(nullable = false)
    private
    String h_contact02;
    @Column(nullable = false)
    private
    String h_petStatus;
    @Column(nullable = false)
    private
    String h_cancellation;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private
    List<HotelPackage> hotelPackageList;


}
