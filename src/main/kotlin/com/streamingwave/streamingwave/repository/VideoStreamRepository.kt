package com.streamingwave.streamingwave.repository

import com.streamingwave.streamingwave.data.VideoStream
import org.springframework.data.jpa.repository.JpaRepository

interface VideoStreamRepository: JpaRepository<VideoStream, Long>