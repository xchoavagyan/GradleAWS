package com.example.gradleaws.converter;

import com.example.gradleaws.annotations.Converter;
import com.example.gradleaws.controller.address.models.AddressResponseModel;
import com.example.gradleaws.controller.person.models.PersonRequestModel;
import com.example.gradleaws.controller.person.models.PersonResponseModel;
import com.example.gradleaws.facade.person.PersonDTO;

@Converter
public class PersonConverter {

    private final AddressConverter addressConverter;

    public PersonConverter(AddressConverter addressConverter) {
        this.addressConverter = addressConverter;
    }

    public PersonDTO buildDataObjFromRequest(PersonRequestModel requestModel) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(requestModel.getName());
        personDTO.setAge(requestModel.getAge());
        personDTO.setCity(requestModel.getCity());
        personDTO.setStreet(requestModel.getStreet());
        return personDTO;
    }

    public PersonResponseModel buildResponseFromDataObj(PersonDTO dataObject) {
        PersonResponseModel personResponseModel = new PersonResponseModel();
        personResponseModel.setName(dataObject.getName());
        personResponseModel.setAge(dataObject.getAge());
        personResponseModel.setId(dataObject.getId());
        AddressResponseModel addressResponseModel = new AddressResponseModel();
        addressResponseModel.setId(dataObject.getAddressId());
        addressResponseModel.setStreet(dataObject.getStreet());
        addressResponseModel.setCity(dataObject.getCity());
        personResponseModel.setAddressResponseModel(addressResponseModel);
        return personResponseModel;
    }
}
