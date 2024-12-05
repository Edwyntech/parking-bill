package tech.edwyn.parking.documentation.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import tech.edwyn.parking.application.ParkingBillApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = ParkingBillApplication.class)
public class CucumberConfiguration {

}
