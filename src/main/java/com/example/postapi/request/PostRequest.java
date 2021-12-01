package com.example.postapi.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {

    private String name;

    private String number;

    private String address;

    private String division;

    private int heart;
}
