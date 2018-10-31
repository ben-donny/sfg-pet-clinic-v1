package guru.springframework.sfgpetclinicv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"guru.springframework.sfgpetclinicv1.model"})
public class SfgPetClinicV1Application {
    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicV1Application.class, args);
    }
}
