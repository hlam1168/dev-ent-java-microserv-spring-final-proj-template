package com.hinkmond.finalproj;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.*;


@RestController
public class JDBCController {
    private final static String KEYFILEPATH = "./keyFile.key";

    @CrossOrigin
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String printCryptTest() {
        AESUtils aesUtils = new AESUtils();

        String encryptedStr = aesUtils.encrypt("Hello World!", KEYFILEPATH);
        return ("Decrypt = " + aesUtils.decrypt(encryptedStr, KEYFILEPATH));
    }

    @CrossOrigin
    @SuppressWarnings("SqlResolve")
    @RequestMapping(value = "/printAllAlumni", method = RequestMethod.GET)
    public String printAllAlumni() {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        StringBuilder resultStr = new StringBuilder();

        String queryStr = "SELECT * from alumni_info;";
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(queryStr);
        while (sqlRowSet.next()) {
            resultStr.append(sqlRowSet.getString("alumni_id")).append(", ")
                    .append(sqlRowSet.getString("name")).append(", ")
                    .append(sqlRowSet.getString("addr")).append(", ")
                    .append(sqlRowSet.getString("email")).append(", ")
                    .append(sqlRowSet.getString("graduation_year")).append(", ")
                    .append(sqlRowSet.getString("created_at"))
                    .append("\n");
        }
        return ("SELECT * from alumni_info:\n" + resultStr);
    }

    @CrossOrigin
    @SuppressWarnings("SqlResolve")
    @RequestMapping(value = "/addAlumni", method = RequestMethod.POST)
    public String addUser(@RequestBody AddAlumniData addAlumniData) {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        String queryStr = "INSERT INTO alumni_info (name, addr, email, graduation_year) " +
                "VALUES (" +
                "'" + addAlumniData.getName() + "'," +
                "'" + addAlumniData.getAddress() + "'," +
                "'" + addAlumniData.getEmail() + "'," +
                "'" + addAlumniData.getGraduation_year() + "'" +
                ");";
        int rowsUpdated = jdbcTemplate.update(queryStr);
        return ("Rows updated: " + rowsUpdated);
    }
}
