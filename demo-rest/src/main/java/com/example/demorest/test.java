package com.example.demorest;
import com.example.demorest.model.demoModel;
import com.example.demorest.repository.demoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class test {


    @Autowired
    private DataSource dataSource;
    @Autowired
    private demoRepository demorepository;
    @Bean
    public void checkDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Database connection is successful.");
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
        try (Connection connection = dataSource.getConnection()) {
            // Get the connected database name
            String dbName = connection.getCatalog();
            System.out.println("Connected to database: " + dbName);
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }

// Check if the table exists

    }

}
