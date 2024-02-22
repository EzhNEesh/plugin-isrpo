package com.itmo.plugin2

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.editor.Editor


class SearchInWeb : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val editor: Editor? = e.getData(PlatformDataKeys.EDITOR)
        val selectedText = editor!!.selectionModel.selectedText

        if (selectedText != null) {
            val selectDialogWrapper = SelectDialogWrapper(e.project)
            if (selectDialogWrapper.showAndGet()) {
                val searchSource = SearchSource(selectDialogWrapper.resource!!, selectedText)
                searchSource.openInWeb()
            }
        }
    }
}