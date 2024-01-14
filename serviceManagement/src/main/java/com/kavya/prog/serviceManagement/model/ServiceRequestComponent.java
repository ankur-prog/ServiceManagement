package com.kavya.prog.serviceManagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="service_request_component")
public class ServiceRequestComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    private String projectInfo;
    private LocalDate startDate;
    private LocalDate endDate;
    private String workLocation;
    private String domain;
    private String role;
    private String skill;
    private String technology;
    private String experience;
    private String onsiteDaysPerWeek;
    private String remoteDaysPerWeek;
}
