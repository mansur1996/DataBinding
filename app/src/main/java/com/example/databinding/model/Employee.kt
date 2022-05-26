package com.example.databinding.model

import androidx.databinding.ObservableField
import java.util.*

class Employee(
    var id: Int?,
    var name: String?,
    var nickname: ObservableField<String>,
    var address: String?,
    var salary: Double?,
    var hobbies: List<String>?,
    var avatar : String?,
)