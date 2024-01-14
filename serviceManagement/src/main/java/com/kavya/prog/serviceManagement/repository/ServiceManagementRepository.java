package com.kavya.prog.serviceManagement.repository;

import com.kavya.prog.serviceManagement.model.ServiceRequestComponent;
import org.springframework.data.jpa.repository.JpaRepository;




    public interface ServiceManagementRepository extends JpaRepository<ServiceRequestComponent,Long> {

    }


