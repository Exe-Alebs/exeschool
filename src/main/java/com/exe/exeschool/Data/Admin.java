package com.exe.exeschool.Data;

import com.exe.exeschool.common.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "admin")
public class Admin extends Person {

}
