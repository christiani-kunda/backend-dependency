package com.mhp.coding.challenges.dependency.notification

import com.mhp.coding.challenges.dependency.inquiry.Inquiry

interface NotificationService {
    fun sendEmail(inquiry: Inquiry)
    fun sendPushNotification(inquiry: Inquiry)
}