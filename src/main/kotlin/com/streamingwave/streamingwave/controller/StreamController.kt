package com.streamingwave.streamingwave.controller

import com.streamingwave.streamingwave.data.Video
import com.streamingwave.streamingwave.data.VideoStream
import com.streamingwave.streamingwave.service.StreamService
import com.streamingwave.streamingwave.service.StreamServiceImpl
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/streams")
class StreamController(val streamService: StreamService) {

    @GetMapping("{streamId}")
    fun getStream(@PathVariable streamId:Long): VideoStream {

        return streamService.getStream(1L)
    }

    @PostMapping
    fun saveVideoStream(@RequestBody videoStream: VideoStream):VideoStream {
        return streamService.saveVideoStream(videoStream)
    }
}
