package foodyloca.app.company.service

import foodyloca.app.company.controller.CompanyResponse
import foodyloca.app.company.model.Company
import foodyloca.app.company.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService(@Autowired val companyRepository: CompanyRepository) {

        fun fetchCompanies(): CompanyResponse {
            val companies = when(companyRepository.fetchCompanies().isEmpty()) {
                true -> CompanyResponse.CompanyNoDataFound("No company data found to retrieve !")
                false -> CompanyResponse.CompanyDataFound(companyRepository.fetchCompanies())
            }
            return companies
        }





}