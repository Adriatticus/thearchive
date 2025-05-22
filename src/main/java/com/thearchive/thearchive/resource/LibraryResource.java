package com.thearchive.thearchive.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryResource {
    private Long id;
    private String owner;
    private List<CardResource> cards;
}
