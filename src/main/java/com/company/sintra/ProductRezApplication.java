package com.company.sintra;

import com.company.sintra.entity.Authority;
import com.company.sintra.entity.Role;
import com.company.sintra.repository.AuthorityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@RequiredArgsConstructor
public class ProductRezApplication  implements CommandLineRunner  {

    private final AuthorityRepository authorityRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductRezApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Authority a = new Authority();
        a.setRole(Role.MANAGER);

//        Authority b = new Authority();
//        b.setRole(Role.USER);
//
//        authorityRepository.saveAll(List.of(a,b));
    }
}
