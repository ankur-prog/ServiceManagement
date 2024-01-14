package com.kavya.prog.serviceManagement.service;

import com.kavya.prog.serviceManagement.dto.ServiceRequestComponentdto;
import com.kavya.prog.serviceManagement.dto.ServiceResponseComponentdto;

import com.kavya.prog.serviceManagement.model.ServiceRequestComponent;
import com.kavya.prog.serviceManagement.repository.ServiceManagementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceManagementService {

    private final ServiceManagementRepository serviceManagementRepository;
    public void createServiceRequestComponent(ServiceRequestComponentdto serviceRequestComponentdto) {

        ServiceRequestComponent serviceRequestComponent = ServiceRequestComponent.builder()
                .projectInfo(serviceRequestComponentdto.getProjectInfo())
                .startDate((LocalDate) serviceRequestComponentdto.getStartDate())
                .endDate((LocalDate) serviceRequestComponentdto.getEndDate())
                .workLocation(serviceRequestComponentdto.getWorkLocation())
                .domain(serviceRequestComponentdto.getDomain())
                .role(serviceRequestComponentdto.getRole())
                .skill(serviceRequestComponentdto.getSkill())
                .technology(serviceRequestComponentdto.getTechnology())
                .experience(serviceRequestComponentdto.getExperience())
                .onsiteDaysPerWeek(serviceRequestComponentdto.getOnsiteDaysPerWeek())
                .remoteDaysPerWeek(serviceRequestComponentdto.getRemoteDaysPerWeek())
                .build();

        serviceManagementRepository.save(serviceRequestComponent);

        log.info("Service Request Component with projectInfo {} and  startDate {} is created successfully.",serviceRequestComponent.getProjectInfo(),serviceRequestComponent.getStartDate());






    }


    public void deleteServiceRequestComponent(Long id) {
        serviceManagementRepository.deleteById(id);
        log.info("Service Request Component with id {} is deleted successfully.",id);
    }

    public List<ServiceResponseComponentdto> getServiceRequestComponent() {
        List<ServiceRequestComponent> serviceRequestComponentList = serviceManagementRepository.findAll();
        List<ServiceResponseComponentdto> serviceResponseComponentdtoList = serviceRequestComponentList.stream().map(this::mapToServiceResponseComponentdto).collect(Collectors.toList());
         return serviceResponseComponentdtoList;



    }

    private ServiceResponseComponentdto mapToServiceResponseComponentdto(ServiceRequestComponent serviceRequestComponent) {
        return ServiceResponseComponentdto.builder()
                .serviceId(serviceRequestComponent.getServiceId())
                .projectInfo(serviceRequestComponent.getProjectInfo())
                .startDate(serviceRequestComponent.getStartDate())
                .endDate(serviceRequestComponent.getEndDate())
                .workLocation(serviceRequestComponent.getWorkLocation())
                .domain(serviceRequestComponent.getDomain())
                .role(serviceRequestComponent.getRole())
                .skill(serviceRequestComponent.getSkill())
                .technology(serviceRequestComponent.getTechnology())
                .experience(serviceRequestComponent.getExperience())
                .onsiteDaysPerWeek(serviceRequestComponent.getOnsiteDaysPerWeek())
                .remoteDaysPerWeek(serviceRequestComponent.getRemoteDaysPerWeek())
                .build();
    }


}
