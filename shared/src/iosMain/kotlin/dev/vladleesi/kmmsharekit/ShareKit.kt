package dev.vladleesi.kmmsharekit

import platform.UIKit.UIActivityViewController
import platform.UIKit.UIApplication

actual object ShareKit {

    actual fun shareText(text: String) {
        val currentViewController = UIApplication.sharedApplication().keyWindow?.rootViewController
        val activityViewController = UIActivityViewController(listOf(text), null)
        currentViewController?.presentViewController(
            viewControllerToPresent = activityViewController,
            animated = true,
            completion = null
        )
    }
}
