package com.streamingwave.streamingwave.controller

import com.streamingwave.streamingwave.data.Stream
import com.streamingwave.streamingwave.service.StreamService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/streams")
class StreamController(val streamService: StreamService) {

    @GetMapping("{streamId}")
    fun getStream(@PathVariable streamId: Long): Stream {
        return streamService.getStream(streamId)
    }

    @PostMapping
    fun createStream(@RequestBody stream: Stream):Stream {
        return streamService.createStream(stream)
    }
}
