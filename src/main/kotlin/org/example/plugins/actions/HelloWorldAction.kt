package org.example.plugins.actions

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import java.awt.event.ActionEvent
import javax.swing.Action

@Suppress("DEPRECATION")
class HelloWorldAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        var notificationGroup = NotificationGroup(
            displayId = "myActionId",
            displayType = NotificationDisplayType.BALLOON,
            isLogByDefault = true
        )

        notificationGroup.createNotification(
            title = "My Title",
            content = "Hello World",
            type = NotificationType.INFORMATION,
            listener = null
        ).notify(event.project)
    }
}