package com.streamingwave.streamingwave.repository

import com.streamingwave.streamingwave.data.Video
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VideoRepository:JpaRepository<Video, Long> {
}