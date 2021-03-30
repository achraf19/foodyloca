package foodyloca.app.company.repository

import foodyloca.app.company.model.Address
import foodyloca.app.company.model.Company
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository


@Repository
class CompanyRepository(@Autowired val jdbc: JdbcTemplate) {

    fun fetchCompanies(): List<Company> {
        return jdbc.query("SELECT * FROM company".trimIndent()
        ) { rs, _ ->
            Company(
                rs.getInt("id"), rs.getString("companyName"),
                rs.getDate("founded"), rs.getString("speciality"),
                rs.getString("typeOfCompany"), rs.getInt("rating"),
                rs.getInt("deliveryTime"), rs.getString("phoneNumber"),
                rs.getString("email"), Address(
                    rs.getString("address.city"), rs.getInt("address.zipCode"), rs.getString("address.street")
                ),
                null
            )
        }
    }
}