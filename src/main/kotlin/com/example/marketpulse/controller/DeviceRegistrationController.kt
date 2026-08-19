package com.example.marketpulse.controller

import com.example.marketpulse.data.model.DeviceRegistration
import com.example.marketpulse.data.repository.DeviceRegistrationRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.slf4j.LoggerFactory

@RestController
@RequestMapping("/devices")
class DeviceRegistrationController(
    private val repository: DeviceRegistrationRepository
) {
    private val logger = LoggerFactory.getLogger(DeviceRegistrationController::class.java)


    @PostMapping("/register")
    fun register(@RequestBody body: DeviceRegistration): ResponseEntity<DeviceRegistration> {
        logger.info("Recibido FID: {}", body.installationId)
        logger.info("Recibido Token: {}", body.fcmToken)
        val saved = repository.save(body)
        return ResponseEntity.ok(saved)
    }
}