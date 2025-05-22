package com.thearchive.thearchive.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SetResource {
    private String code;
    private String name;
    private String releaseDate;
    private String type;
}
