package uz.isystem.ShopUz.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("address"))
public class Address {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
