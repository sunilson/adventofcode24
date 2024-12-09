package utils

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

suspend fun <T, R> List<T>.mapParallel(block: suspend (T) -> R): List<R> {
    return coroutineScope {
        map { async { block(it) } }.map { it.await() }
    }
}
