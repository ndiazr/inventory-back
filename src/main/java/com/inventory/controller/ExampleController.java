package com.inventory.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Api(tags = "example-controller")
public class ExampleController
{
    @ApiOperation(value = "Get a greeting", response = String.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully response"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
        }
    )
    @GetMapping(value = "/greeting", produces = "application/json")
    public String greeting()
    {
        return "Hello!";
    }
}

