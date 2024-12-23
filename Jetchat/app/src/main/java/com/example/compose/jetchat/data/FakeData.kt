/*
 * 版权所有 2020 Android 开源项目
 *
 * 根据 Apache 许可证 2.0 版（以下简称“许可证”）授权；
 * 除非遵循许可证，否则您不能使用此文件。
 * 您可以在以下网址获取许可证副本：
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * 除非适用法律要求或书面同意，否则根据许可证分发的软件
 * 是按“原样”分发的，没有任何明示或暗示的担保或条件。
 * 请参阅许可证以了解管理权限和限制的特定语言。
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.data.EMOJIS.EMOJI_CLOUDS
import com.example.compose.jetchat.data.EMOJIS.EMOJI_FLAMINGO
import com.example.compose.jetchat.data.EMOJIS.EMOJI_MELTING
import com.example.compose.jetchat.data.EMOJIS.EMOJI_PINK_HEART
import com.example.compose.jetchat.data.EMOJIS.EMOJI_POINTS
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "我",
        "看看这个！",
        "晚上8:07"
    ),
    Message(
        "我",
        "谢谢你！$EMOJI_PINK_HEART",
        "晚上8:06",
        R.drawable.sticker
    ),
    Message(
        "泰勒·布鲁克斯",
        "您可以使用所有相同的东西",
        "晚上8:05"
    ),
    Message(
        "泰勒·布鲁克斯",
        "@aliconors 看一下 `Flow.collectAsStateWithLifecycle()` API",
        "晚上8:05"
    ),
    Message(
        "约翰·格伦",
        "也是 Compose 新手 $EMOJI_FLAMINGO，你看过 JetNews 示例吗？" +
            "大多数博客文章很快就会过时，但这个示例始终保持最新，并处理异步数据加载（虽然它是假的，但相同的想法适用） $EMOJI_POINTS https://goo.gle/jetnews",
        "晚上8:04"
    ),
    Message(
        "我",
        "Compose 新手：我在网上搜寻有关异步数据加载的教程，但没有找到任何好的教程 $EMOJI_MELTING $EMOJI_CLOUDS。" +
            "加载异步数据并发出可组合小部件的推荐方式是什么？",
        "晚上8:03"
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#作家",
    channelMembers = 42
)

/**
 * 示例同事档案
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.someone_else,
    name = "泰勒·布鲁克斯",
    status = "离开",
    displayName = "taylor",
    position = "Openlane 的高级 Android 开发人员",
    twitter = "twitter.com/taylorbrookscodes",
    timeZone = "当地时间 12:25 AM（东部夏令时）",
    commonChannels = "2"
)

/**
 * 示例“我”的档案。
 */
val meProfile = ProfileScreenState(
    userId = "me",
    photo = R.drawable.ali,
    name = "阿里·康纳斯",
    status = "在线",
    displayName = "aliconors",
    position = "Yearin 的高级 Android 开发人员\nGoogle 开发者专家",
    twitter = "twitter.com/aliconors",
    timeZone = "在你的时区",
    commonChannels = null
)

object EMOJIS {
    // EMOJI 15
    const val EMOJI_PINK_HEART = "\uD83E\uDE77"

    // EMOJI 14 🫠
    const val EMOJI_MELTING = "\uD83E\uDEE0"

    // ANDROID 13.1 😶‍🌫️
    const val EMOJI_CLOUDS = "\uD83D\uDE36\u200D\uD83C\uDF2B️"

    // ANDROID 12.0 🦩
    const val EMOJI_FLAMINGO = "\uD83E\uDDA9"

    // ANDROID 12.0  👉
    const val EMOJI_POINTS = " \uD83D\uDC49"
}

