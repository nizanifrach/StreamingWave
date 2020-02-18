package com.streamingwave.streamingwave.service

import com.streamingwave.streamingwave.data.Video
import com.streamingwave.streamingwave.data.VideoStream
import com.streamingwave.streamingwave.repository.VideoRepository
import com.streamingwave.streamingwave.repository.VideoStreamRepository
import org.springframework.stereotype.Service


@Service
class StreamServiceImpl(val videoStreamRepository: VideoStreamRepository, val videoRepository: VideoRepository): StreamService {

    override fun getStream(streamId: Long): VideoStream {
        return VideoStream(1, null)
    }

    override fun saveVideo(video: Video):Video {
        return videoRepository.save(video)
    }

    override fun saveVideoStream(videoStream: VideoStream): VideoStream {
        return videoStreamRepository.save(videoStream)
    }
}