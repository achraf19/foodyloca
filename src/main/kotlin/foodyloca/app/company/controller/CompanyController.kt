package foodyloca.app.company.controller

import foodyloca.app.company.model.Company
import foodyloca.app.company.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("company")
class CompanyController(@Autowired val companyService: CompanyService) {
    @GetMapping("/all")
    fun getCompanies(): ResponseEntity<Any?> = ResponseEntity.ok(companyService.fetchCompanies())
}