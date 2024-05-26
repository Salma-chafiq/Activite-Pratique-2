/*package ma.enset.studentsapp;

import ma.enset.studentsapp.entities.Product;
import ma.enset.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentsAppApplication implements CommandLineRunner {
    @Autowired // l'injection des dépendances
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentsAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //une fois que spring démarre automatiquement il fait appel à la méthode run
        //productRepository.save(new Product(null,"Computer",4300,3));
        //productRepository.save(new Product(null,"Printer",1200,4));
        //productRepository.save(new Product(null,"Smart Phone",3200,32));
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("***********************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println(product.getPrice());
        System.out.println("***********************");
        // h2 : base de données in memory : c-a-d BD qui démarré en mémoire mais une fois que j'arrete l'application je perds les données
        System.out.println("--------------------------");
        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p-> System.out.println(p));
        System.out.println("--------------------------");
        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(p-> System.out.println(p));
        System.out.println("--------------------------");
        List<Product> productList3 = productRepository.findByPriceGreaterThan(3000);
        productList3.forEach(p-> System.out.println(p));
        System.out.println("--------------------------");
        List<Product> productList4 = productRepository.searchByPrice(3000);
        productList4.forEach(p-> System.out.println(p));
    }
}
*/