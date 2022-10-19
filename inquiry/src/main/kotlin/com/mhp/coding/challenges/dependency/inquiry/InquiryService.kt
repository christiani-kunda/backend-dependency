package com.mhp.coding.challenges.dependency.inquiry

import com.mhp.coding.challenges.dependency.notification.NotificationService
import mu.KotlinLogging
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class InquiryService(private val notificationService: NotificationService) {
    fun create(inquiry: Inquiry) {
        logger.info {
            "User sent inquiry: $inquiry"
        }
        notificationService.sendEmail(inquiry)
        notificationService.sendPushNotification(inquiry)

    }
}

data class Inquiry(
    var username: String,
    var recipient: String,
    var text: String,
)
