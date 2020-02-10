package com.streamingwave.streamingwave.controller

import com.streamingwave.streamingwave.data.VideoStream
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/streams")
class StreamController {

    @GetMapping("{streamId}")
    fun getStream(@PathVariable streamId:Long): VideoStream {
        return VideoStream(1 ,null)
    }
}