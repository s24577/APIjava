package com.example.updater;

import com.example.updater.updater.IUpdateData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.example.*"})
public class UpdaterApplication  implements CommandLineRunner {

    private final IUpdateData updater;

    public UpdaterApplication(IUpdateData updater) {
        this.updater = updater;
    }

    public static void main(String[] args) {
        SpringApplication.run(UpdaterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        updater.updateEverything();
    }
}
