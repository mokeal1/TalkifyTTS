package com.github.lonepheasantwarrior.talkify.domain.model

/**
 * 小米 MiMo 语音合成引擎配置
 *
 * 继承 [BaseEngineConfig]，封装小米 MiMo 引擎所需的配置信息
 * 使用小米服务的 API Key 进行认证
 *
 * @property voiceId 声音 ID，如 "default_zh"，支持克隆音色自定义ID
 * @property apiKey 小米平台的 API Key，用于认证，从小米开放平台获取
 * @property model 模型 ID，默认 "mimo-v2.5"，支持克隆模型自定义ID
 */
data class XiaoMiMimoConfig(
    override val voiceId: String = "",
    val apiKey: String = "",
    val model: String = DEFAULT_MODEL
) : BaseEngineConfig(voiceId) {

    companion object {
        const val DEFAULT_MODEL = "mimo-v2.5"
    }
}
