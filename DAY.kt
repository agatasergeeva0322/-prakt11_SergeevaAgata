class DAY (var day_numb: Int) {
    fun DayInfo(day: DayOfWeek) {
        println("День недели (ин инглиш): $day")
    }
    fun isWeekend(day: DayOfWeek) {
        if (day.dayNumber == 6 || day.dayNumber == 7) {
            println("${day.getDay()} - это выходной")
        }
        else {
            println("${day.getDay()} - это рабочий день недели")
        }
    }
   fun RomesDay(): String {
        when(day_numb)
        {
            1 -> return "день Луны"
            2 -> return "день Марса"
            3 -> return "день Меркурия"
            4 -> return "день Юпитера"
            5 -> return "день Венеры"
            6 -> return "день Сатурна"
            7 -> return "день Солнца"
            else -> return "Нет такого дня недели ни у нас, ни у римлян"
        }
   }
    fun colorDayInfo(day: DayOfWeek, color: Color) {
        println("А если бы это был монстр с моей игре, то его бы звали: ${color.getColor()} ${day.getDay()}. Красиво, не правда ли?")
    }
}