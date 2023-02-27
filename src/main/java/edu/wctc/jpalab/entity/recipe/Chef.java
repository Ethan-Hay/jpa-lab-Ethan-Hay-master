package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Chef")
public class Chef {
@Column(name = "chef_id")
    private int id;
@Column(name = "chef_firstname")
    private String firstName;
@Column(name = "chef_lastname")
    private String lastName;
@Column(name="chef_avatar")
    private String avatar;
}
