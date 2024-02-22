package com.itmo.plugin2

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.editor.Editor


class SearchInWeb : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val editor: Editor? = e.getData(PlatformDataKeys.EDITOR)
        val selectedText = editor!!.selectionModel.selectedText

        var url = "https://www.youtube.com/results?search_query="
        url += selectedText
        BrowserUtil.open(url)
    }
}