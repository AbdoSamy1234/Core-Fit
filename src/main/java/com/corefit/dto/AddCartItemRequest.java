package com.corefit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCartItemRequest {
    private long productId;
    private int quantity;
}
