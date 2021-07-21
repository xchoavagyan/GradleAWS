package com.example.gradleaws.converter;

import com.example.gradleaws.annotations.Converter;
import com.example.gradleaws.controller.product.models.ProductRequestModel;
import com.example.gradleaws.controller.product.models.ProductResponseModel;
import com.example.gradleaws.facade.product.ProductDTO;

@Converter
public class ProductConverter {

    public ProductDTO productDataObjFromRequest(ProductRequestModel requestModel) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(requestModel.getProductName());
        return productDTO;
    }

    public ProductResponseModel responseFromDataObj(ProductDTO dto){
        ProductResponseModel responseModel = new ProductResponseModel();
        responseModel.setId(dto.getId());
        responseModel.setProductName(dto.getProductName());
        return responseModel;
    }
}
