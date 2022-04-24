package br.com.sptech.totemsistem;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connection {

    private BasicDataSource dataSource;

    public Connection() {
        this.dataSource = new BasicDataSource();

        //local
        /*
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/TotemSystem");
        dataSource.setUsername("urubu100");
        dataSource.setPassword("urubu100");
        */


        //azure


        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svr-totem-system.database.windows.net:1433;database=bd-totem-system;user=admin-totem-system@svr-totem-system;password={2ads#grupo9};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
        dataSource.setUsername("admin-totem-system");
        dataSource.setPassword("2ads#grupo9");




    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

}
