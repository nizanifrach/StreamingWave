package com.streamingwave.streamingwave.service

import com.streamingwave.streamingwave.data.Video
import com.streamingwave.streamingwave.data.VideoStream

interface StreamService {

    fun getStream(streamId: Long): VideoStream
    fun saveVideo(video: Video): Video
    fun saveVideoStream(videoStream: VideoStream): VideoStream
}