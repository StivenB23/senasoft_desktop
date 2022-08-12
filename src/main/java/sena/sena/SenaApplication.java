package sena.sena;

import Views.Dashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SenaApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SenaApplication.class);

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(SenaApplication.class, args);
        
        LOG.info("SenaApplication stopped");
    }

    @Override
    public void run(String... args) throws Exception {
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }

}
