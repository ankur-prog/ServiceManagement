package com.kavya.prog.serviceManagement.serviceController;


import com.kavya.prog.serviceManagement.dto.ServiceRequestComponentdto;
import com.kavya.prog.serviceManagement.dto.ServiceResponseComponentdto;


import com.kavya.prog.serviceManagement.service.ServiceManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Creted by kavya
 * Date: 14/01/2023
 * This class is used to create Service Request Component
 */


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/serviceManagement")
public class ServiceManagementController {

private final ServiceManagementService serviceManagementService;


    /**
     * This method is used to create Service Request Component
     * @param serviceRequestComponentdto
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createServiceRequestComponent(@RequestBody ServiceRequestComponentdto serviceRequestComponentdto)
    {
        serviceManagementService.createServiceRequestComponent(serviceRequestComponentdto);
        return  ResponseEntity.status(HttpStatus.CREATED).body("Service Request Component is created successfully");
    }

    /**
     * This method is used to delete Service Request Component
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteServiceRequestComponent(@PathVariable("id") Long id)
    {
        serviceManagementService.deleteServiceRequestComponent(id);
        return  ResponseEntity.status(HttpStatus.OK).body("Service Request Component is deleted successfully");
    }

    /**
     * This method is used to get Service Request Component
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ServiceResponseComponentdto>> getServiceRequestComponent()
    {
        List<ServiceResponseComponentdto> serviceResponseComponetdtoList= serviceManagementService.getServiceRequestComponent();
        if(serviceResponseComponetdtoList.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return  new ResponseEntity<>(serviceResponseComponetdtoList,HttpStatus.OK);

    }
}


