package fr.formation;


import fr.formation.models.Voiture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("fr.formation")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Voiture voiture = context.getBean(Voiture.class);
        voiture.setCouleur("grise");
        voiture.setPoids(1220.65f);
        System.out.println(voiture);
    }
}
