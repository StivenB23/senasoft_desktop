package sena.sena;

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
    JOptionPane.showMessageDialog(null, "Hola mi principe");
		SpringApplication.run(SenaApplication.class, args);
    LOG.info("SenaApplication stopped");
	}

  @Override
  public void run(String... args) throws Exception {
  }

}
