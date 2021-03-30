package foodyloca.app.company.controller

import foodyloca.app.company.model.Company

sealed class CompanyResponse {
    data class CompanyDataFound(val companies: List<Company>): CompanyResponse()
    data class CompanyNoDataFound(val info: String): CompanyResponse()
    data class CompanyInfo(val info: String, val companyInfo: Company? = null): CompanyResponse()
}
