package com.streamingwave.streamingwave.service

import com.streamingwave.streamingwave.data.Stream
import com.streamingwave.streamingwave.repository.StreamRepository
import org.springframework.stereotype.Service


@Service
class StreamServiceImpl(val streamRepository: StreamRepository): StreamService {

    override fun getStream(streamId: Long): Stream {
       return streamRepository.getOne(streamId)
    }

    override fun createStream(stream: Stream):Stream {
        return streamRepository.save(stream)
    }

    override fun deleteStream(stream: Stream) {
        streamRepository.delete(stream)
    }
}