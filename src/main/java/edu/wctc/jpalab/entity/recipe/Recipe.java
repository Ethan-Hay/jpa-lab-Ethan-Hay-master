package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Recipe")
public class Recipe {
    @Id
    @Column(name="recipe_id")
    private int id;
    @Column(name = "recipe_chef_id")
    private int recChefId;
    @Column(name = "recipe_title")
    private String recTitle;
    @Column(name = "recipe_description")
    private String recDesc;
}
