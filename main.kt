fun main() {
    try {
        var monday = DayOfWeek.Monday
        val lav = Color.Lavander
        println("День недели: ${monday.getDay()} (${monday.dayNumber})")
        println("Цвет: ${lav.getColor()} (#${lav.colorValue.toString(16)})")
        println("\n")

        var day_numb = 0;
        var color_numb = 0;
        do {
            print("Введите первое число от 1 до 7: ")
            day_numb = readln()!!.toInt()
        } while (day_numb < 1 || day_numb > 7)
        do {
            print("Введите второе число от 1 до 7: ")
            color_numb = readln()!!.toInt()
        } while (color_numb < 1 || color_numb > 7)
        println("")

        var weekDay = DAY(day_numb);
        weekDay.DayInfo(DayOfWeek.values()[day_numb - 1])
        weekDay.isWeekend(DayOfWeek.values()[day_numb - 1])
        println("У римлян он называется: ${weekDay.RomesDay()}")
        weekDay.colorDayInfo(DayOfWeek.values()[day_numb - 1], Color.values()[color_numb - 1])
        println("")

        var color = COLORS(color_numb)
        color.ColorInfo(Color.values()[color_numb - 1])
        color.ColorInfo_Rus(Color.values()[color_numb - 1])
        println(color.MoodOfColor())
        color.ColorCode(Color.values()[color_numb - 1])
    }
    catch (e : Exception)
    {
        println ("Ошибка")
    }
}