package com.streamingwave.streamingwave.service

import com.streamingwave.streamingwave.data.VideoStream


class StreamServiceImpl: StreamService {
    fun getStream(streamId: Long): VideoStream {
        return VideoStream(1, null)
    }
}