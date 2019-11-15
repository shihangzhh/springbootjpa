package xynu.shihang.springbootjpa.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id    //表示一个注解
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //表示递增
    private  long id;

    @Column(name = "name",nullable = true ,length=30)
    private  String name;
    @Column(name = "age",nullable = true ,length=15)
    private  int age;
}
