package com.streamingwave.streamingwave.data

import javax.persistence.*

@Entity
data class Video (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @Column(nullable = false)
        val streamId: Long,
        @Column(nullable = false)
        val externalId: String,
        val startTime: Long,
        val endTime: Long,
        val position: Long
)
