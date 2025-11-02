package badwiki.service;
import badwiki.model.Product;
import badwiki.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
        
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(Long prod_id) {
        return repo.findById(prod_id).orElse(new Product());
    }
    
    public void addProducts(List<Product> product){
        repo.saveAll(product);
    }
    
    public void updateProduct(Product product){
        repo.save(product);
    }
    
    public void deleteProduct(Long prod_id){
        repo.deleteById(prod_id);
    }
}
