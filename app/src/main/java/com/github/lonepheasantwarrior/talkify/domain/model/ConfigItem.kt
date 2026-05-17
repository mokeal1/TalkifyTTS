package com.github.lonepheasantwarrior.talkify.domain.model

data class ConfigItem(
    val key: String,
    val label: String,
    val value: String,
    val isPassword: Boolean = false,
    val isVoiceSelector: Boolean = false,
    /** 下拉选项列表 (displayName, value)，非空时渲染为下拉选择框 */
    val selectorOptions: List<Pair<String, String>>? = null
)
