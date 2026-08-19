package com.example.marketpulse

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarketpulseApplication


fun main(args: Array<String>) {
	val logger = LoggerFactory.getLogger(MarketpulseApplication::class.java)
	
    logger.info("==========================================")
    logger.info("Comenzando MarketpulseApplication...")
    logger.info("==========================================")
    
    runApplication<MarketpulseApplication>(*args)
    
    logger.info("==========================================")
    logger.info("MarketpulseApplication se ha iniciado con éxito.")
    logger.info("==========================================")
}