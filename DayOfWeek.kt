enum class DayOfWeek(val dayNumber: Int) {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    fun getDay(): String {
        return when (this) {
            Monday -> "Понедельник"
            Tuesday -> "Вторник"
            Wednesday -> "Среда"
            Thursday -> "Четверг"
            Friday -> "Пятница"
            Saturday -> "Суббота"
            Sunday -> "Вокресенье"
        }
    }
}