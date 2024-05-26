package ma.enset.studentsapp.web;

import ma.enset.studentsapp.entities.Product;
import ma.enset.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//web service
@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    //http://localhost:8085/products/
    @GetMapping("/products") // return format JSON car j'ai utiliser un RestController
    public List<Product> products(){
        return productRepository.findAll();
    }
    //http://localhost:8085/products/1
    @GetMapping("/products/{id}")
    public Product findProdcut(@PathVariable Long id){
        return productRepository.findById(id).orElse(null);// product n'existe pas => return null
    }
}
