package com.example.marketpulse.data.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "device_registrations")
data class DeviceRegistration(
    @Id
    @Column(name = "installation_id")
    @JsonProperty("installation_id")
    val installationId: String = "",
    
    @Column(name = "fcm_token", nullable = false)
    @JsonProperty("fcm_token")
    val fcmToken: String = ""
)