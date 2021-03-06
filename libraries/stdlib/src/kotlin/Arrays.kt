package kotlin

/** Returns true if the array is not empty */
public fun <T> Array<out T>.isNotEmpty() : Boolean = !this.isEmpty()

/** Returns true if the array is empty */
public fun <T> Array<out T>.isEmpty() : Boolean = this.size == 0

public val          BooleanArray.lastIndex : Int
    get() = this.size - 1

public val             ByteArray.lastIndex : Int
    get() = this.size - 1

public val            ShortArray.lastIndex : Int
    get() = this.size - 1

public val              IntArray.lastIndex : Int
    get() = this.size - 1

public val             LongArray.lastIndex : Int
    get() = this.size - 1

public val            FloatArray.lastIndex : Int
    get() = this.size - 1

public val           DoubleArray.lastIndex : Int
    get() = this.size - 1

public val             CharArray.lastIndex : Int
    get() = this.size - 1

public val <T: Any?> Array<out T>.lastIndex : Int
    get() = this.size - 1
