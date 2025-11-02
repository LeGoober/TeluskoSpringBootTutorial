package badwiki.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long prod_id;

    @Column(name = "prod_name", nullable = false, length = 100)
    private String prod_name;
    @Column(name = "prod_price", nullable = false)
    private int prod_price;

}
