package com.example.kds2


import com.squareup.moshi.Json

class data: ArrayList<dataItem>()

data class Address(
    @Json(name = "address1")
    val address1: String,
    @Json(name = "address2")
    val address2: String,
    @Json(name = "address3")
    val address3: String
)

data class Location(
    @Json(name = "latitude")
    val latitude: Double,
    @Json(name = "lontitude")
    val lontitude: Double
)

data class Subway1(
    @Json(name = "distance")
    val distance: Int,
    @Json(name = "name")
    val name: String
)

data class Subway2(
    @Json(name = "distance")
    val distance: Int,
    @Json(name = "name")
    val name: String
)

data class Subway3(
    @Json(name = "distance")
    val distance: Int,
    @Json(name = "name")
    val name: String
)

data class dataItem(
    @Json(name = "address")
    val address: Address,
    @Json(name = "agentPhone")
    val agentPhone: String,
    @Json(name = "agentTitle")
    val agentTitle: String,
    @Json(name = "area")
    val area: Double,
    @Json(name = "deposit")
    val deposit: Int,
    @Json(name = "image_thumbnail")
    val imageThumbnail: String,
    @Json(name = "itemId")
    val itemId: Int,
    @Json(name = "location")
    val location: Location,
    @Json(name = "manageCost")
    val manageCost: Double,
    @Json(name = "monthlyRentPrice")
    val monthlyRentPrice: Int,
    @Json(name = "salePrice")
    val salePrice: Any,
    @Json(name = "salesType")
    val salesType: String,
    @Json(name = "serviceType")
    val serviceType: String,
    @Json(name = "subway1")
    val subway1: Subway1,
    @Json(name = "subway2")
    val subway2: Subway2,
    @Json(name = "subway3")
    val subway3: Subway3
)