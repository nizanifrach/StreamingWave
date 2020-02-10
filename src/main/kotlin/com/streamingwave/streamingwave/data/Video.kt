package com.streamingwave.streamingwave.data

data class Video(
        val id: Long,
        val streamId: Long,
        val externalId: String,
        val startTime: Long,
        val endTime: Long,
        val position: Long
)