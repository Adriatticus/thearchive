package com.thearchive.thearchive.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardResource {
    private Long id;
    private String name;
    private String notes;
    private String tags;
    private SetResource set;
    private String imageUrl;
    private String rarity;
    private String manaCost;
    private String power;
    private String toughness;
    private String artist;
    // private String loyalty;
    
}