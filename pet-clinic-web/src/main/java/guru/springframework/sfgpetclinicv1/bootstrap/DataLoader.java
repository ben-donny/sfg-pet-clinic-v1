package guru.springframework.sfgpetclinicv1.bootstrap;

import guru.springframework.sfgpetclinicv1.model.Owner;
import guru.springframework.sfgpetclinicv1.model.Vet;
import guru.springframework.sfgpetclinicv1.services.OwnerService;
import guru.springframework.sfgpetclinicv1.services.VetService;
import guru.springframework.sfgpetclinicv1.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinicv1.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
       ownerService = new OwnerServiceMap();
       vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loading Owners......");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("James");
        vet2.setLastName("Don");

        vetService.save(vet2);

        System.out.println("Loading Vets....");

    }
}
