class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate>{
        var currentDate = start
        override fun hasNext(): Boolean = currentDate <= end

        override fun next(): MyDate {
            if (!hasNext()) throw NoSuchElementException("Out of date")
            val result = currentDate
            currentDate = currentDate.followingDate()
            return result
        }

    }



}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}