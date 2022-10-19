package com.mhp.coding.challenges.dependency.notifications

import com.mhp.coding.challenges.dependency.inquiry.Inquiry
import com.mhp.coding.challenges.dependency.notification.NotificationService
import org.springframework.stereotype.Service

@Service
class NotificationServiceImpl(private val emailHandler: EmailHandler, private val pushNotificationHandler: PushNotificationHandler): NotificationService {

    override fun sendEmail(inquiry: Inquiry) {
        emailHandler.sendEmail(inquiry)
    }

    override fun sendPushNotification(inquiry: Inquiry) {
        pushNotificationHandler.sendNotification(inquiry)
    }
}