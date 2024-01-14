package com.kavya.prog.serviceManagement.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRequestComponentdto {
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
