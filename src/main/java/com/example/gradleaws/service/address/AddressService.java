package com.example.gradleaws.service.address;

import com.example.gradleaws.facade.address.AddressDTO;

import java.util.ArrayList;

public interface AddressService {

    AddressDTO getById(Long id);

    ArrayList<AddressDTO> getAll();

}
