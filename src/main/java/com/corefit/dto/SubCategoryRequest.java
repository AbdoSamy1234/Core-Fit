package com.corefit.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubCategoryRequest {
    private long id;
    private String name;
    private Long marketId;
}
