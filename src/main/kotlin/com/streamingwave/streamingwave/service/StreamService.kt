package com.streamingwave.streamingwave.service

import com.streamingwave.streamingwave.data.Stream

interface StreamService {

    fun getStream(streamId: Long): Stream
    fun createStream(stream: Stream): Stream
    fun deleteStream(stream: Stream)
}