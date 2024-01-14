package com.kavya.prog.serviceManagement.dto;

import com.kavya.prog.serviceManagement.model.ServiceRequestComponent;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ServiceResponseComponentdto {
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
