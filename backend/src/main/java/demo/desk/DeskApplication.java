package demo.desk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;
@SpringBootApplication
public class DeskApplication {
 public static void main(String[] args) { SpringApplication.run(DeskApplication.class,args); }
 @Bean CommandLineRunner seed(DeskRepository repo) {
  return args -> { if (repo.all().isEmpty()) {
  repo.insert("1",new DeskRecord.Input("Postal address mismatch","Registration desk","Demographics","Received","DEMO-RC-001",LocalDate.now().plusDays(2),"Summarise the review decision without entering real names, identifiers or medical details.",2));
  repo.insert("2",new DeskRecord.Input("Duplicate encounter summary","Visit records team","Visit summary","Under review","DEMO-RC-002",LocalDate.now().plusDays(6),"Summarise the review decision without entering real names, identifiers or medical details.",4));
  repo.insert("3",new DeskRecord.Input("Portal display order","Portal support","Patient portal","Resolved","DEMO-RC-003",LocalDate.now().plusDays(10),"Summarise the review decision without entering real names, identifiers or medical details.",1));
  repo.insert("4",new DeskRecord.Input("Preferred name formatting","Registration desk","Demographics","Received","DEMO-RC-004",LocalDate.now().plusDays(14),"Summarise the review decision without entering real names, identifiers or medical details.",2));
  repo.insert("5",new DeskRecord.Input("Summary date mismatch","Visit records team","Visit summary","Under review","DEMO-RC-005",LocalDate.now().plusDays(18),"Summarise the review decision without entering real names, identifiers or medical details.",3));
  repo.insert("6",new DeskRecord.Input("Portal label discrepancy","Portal support","Patient portal","Resolved","DEMO-RC-006",LocalDate.now().plusDays(22),"Summarise the review decision without entering real names, identifiers or medical details.",1));
  }};
 }
}
