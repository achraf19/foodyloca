package foodyloca.app.company.model

import java.util.*


data class Company(
    val id: Int,
    val companyName: String,
    val founded: Date,
    val speciality: String,
    val typeOfCompany: String,
    val rating: Int,
    val deliveryTime: Int,
    val phoneNumber: String,
    val email: String,
    var address: Address,
    var foods: List<Food>?
)

data class Address (
    val city: String,
    val zipCode: Int,
    val street: String
)

data class Food (
    val foodName: String,
    val price: Double,
    val addedOn: Date
)

