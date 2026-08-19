package com.example.marketpulse.data.repository

import com.example.marketpulse.data.model.DeviceRegistration
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DeviceRegistrationRepository : JpaRepository<DeviceRegistration, String>