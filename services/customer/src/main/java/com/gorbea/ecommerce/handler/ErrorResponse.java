package com.gorbea.ecommerce.handler;

import java.util.Map;
import java.util.Set;

public record ErrorResponse(
    Map<String, String> errors
    // "firstName","First Name should be valid"
) {

}
