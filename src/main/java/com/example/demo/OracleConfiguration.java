package com.example.demo;
import com.sun.istack.NotNull;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ConfigurationProperties("oracle")
public class OracleConfiguration {
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }


//  DataSource dataSource() throws SQLException {

//      OracleDataSource dataSource = new OracleDataSource();
//      dataSource.setUser(username);
//      dataSource.setPassword(password);
//      dataSource.setURL(url);
//      dataSource.setImplicitCachingEnabled(true);
//      dataSource.setFastConnectionFailoverEnabled(true);
//      return dataSource;
//  }

        @Bean(name = "mySqlDataSource")
        @Primary
        public DataSource mySqlDataSource()
        {
            DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
            dataSourceBuilder.url("jdbc:oracle:thin:@localhost:1521/APEX");
            dataSourceBuilder.username("APP_DEV");
            dataSourceBuilder.password("Bonyan123");

            return dataSourceBuilder.build();
        }
    }


