package com.streamingwave.streamingwave.repository

import com.streamingwave.streamingwave.data.Stream
import org.springframework.data.jpa.repository.JpaRepository

interface StreamRepository: JpaRepository<Stream, Long>