package com.streamingwave.streamingwave.data

import javax.persistence.*

@Entity
data class VideoStream(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val media: List<Video>?
)