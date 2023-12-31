package com.MedicineManagement.entity;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="medicine_details")
public class Medicines {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicineId;

    @Column(name = "name")
    private String medicineName;
    
    @Column(name = "description")
    private String medicineDescription;
}
