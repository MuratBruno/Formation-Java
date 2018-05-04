/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.dao.impl;

import java.sql.Types;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

/**
 *
 * @author oandrade
 */
public class InsertUser extends SqlUpdate {

    private static final String SQL_INSERT_CONTACT =
            "insert into user (email, password, firstname, lastname) values (:email, :password, :firstname, :lastname)";

    public InsertUser(DataSource dataSource) {
        super(dataSource, SQL_INSERT_CONTACT);
        super.declareParameter(new SqlParameter("email", Types.VARCHAR));
        super.declareParameter(new SqlParameter("password", Types.VARCHAR));
        super.declareParameter(new SqlParameter("firstname", Types.VARCHAR));
        super.declareParameter(new SqlParameter("lastname", Types.VARCHAR));
        super.setGeneratedKeysColumnNames(new String[]{"id"});
        super.setReturnGeneratedKeys(true);
    }
}
