package com.itmo.plugin2

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.*

class SelectDialogWrapper(project: Project?) : DialogWrapper(project) {
    private var labelResource: JLabel? = null
    var resource: RESOURCE? = RESOURCE.YANDEX
    private var buttonYoutube: JButton? = null
    private var buttonYandex: JButton? = null
    private var project: Project? = null


    init {
        init()
        title = "Select Resource"
        this.project = project
    }

    override fun createCenterPanel(): JComponent {
        val dialogPanel = JPanel()
        labelResource = JLabel("Select resource: ")
        dialogPanel.add(labelResource)
        buttonYoutube = JButton("Youtube")
        buttonYoutube!!.addActionListener { resource = RESOURCE.YOUTUBE }
        dialogPanel.add(buttonYoutube)
        buttonYandex = JButton("Yandex")
        buttonYandex!!.addActionListener { resource = RESOURCE.YANDEX }
        dialogPanel.add(buttonYandex)
        return dialogPanel
    }
}