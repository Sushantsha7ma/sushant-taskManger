package comm.example;

import comm.example.model.HomeTask;
import comm.example.model.OfficeTask;
import comm.example.model.SocialTask;
import comm.example.repository.HomeTaskRepository;
import comm.example.repository.OfficeTaskRepository;
import comm.example.repository.SocialTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class OfficeTasksServiceApplication implements CommandLineRunner {
    private OfficeTaskRepository officeTaskRepository;
    private HomeTaskRepository homeTaskRepository;
    private SocialTaskRepository socialTaskRepository;
    @Autowired
    public OfficeTasksServiceApplication(OfficeTaskRepository officeTaskRepository, HomeTaskRepository homeTaskRepository, SocialTaskRepository socialTaskRepository) {
        this.officeTaskRepository = officeTaskRepository;
        this.homeTaskRepository = homeTaskRepository;
        this.socialTaskRepository = socialTaskRepository;
    }




    public static void main(String[] args) {
        SpringApplication.run(OfficeTasksServiceApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
    officeTaskRepository.save(new OfficeTask(1,"Get work done from home",10,"Done","20-06-2020","21-06-2020","blue"));
    officeTaskRepository.save(new OfficeTask(2,"Manage your calls",8,"Doing","10-02,2019","10-10-2020","yellow"));
    homeTaskRepository.save(new HomeTask(3,"Get cleaning of house done",7,"Processing","20-06-2020","21-06-20","black"));
    socialTaskRepository.save(new SocialTask(4,"Email Sushant",10,"Accomplished","21-06-2020","21-06-2020","Red"));
    }
    }


