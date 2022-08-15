package com.arafsoft.myapplication.algorithms

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

object DefaultThreadPool {
    public val threadCounts: ExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
}