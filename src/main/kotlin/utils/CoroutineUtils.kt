package utils

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

suspend fun <T, R> List<T>.mapParallel(block: suspend (T) -> R): List<R> {
    return coroutineScope {
        map { async { block(it) } }.map { it.await() }
    }
}

suspend fun <T> Iterable<T>.forEachParallel(block: suspend (T) -> Unit) =
    coroutineScope {
        map { async { block(it) } }.forEach { it.await() }
    }
