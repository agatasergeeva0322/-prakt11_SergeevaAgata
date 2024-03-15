class COLORS (var color_numb: Int){
    fun ColorInfo(color: Color) {
        println("Международное название цвета: $color")
    }
    fun ColorInfo_Rus(color: Color) {
        println("На русском его следует называть: ${color.getColor()}")
    }
    fun MoodOfColor():String{
        when(color_numb)
        {
            1 -> return "Настроение танцевать в поле цветов"
            2 -> return "Настроение готовить чай"
            3 -> return "Настроение перечитать 'Мастер и Маргарита'"
            4 -> return "Настроение обновить монстров в игре по птпм"
            5 -> return "Настроение спать"
            6 -> return "Настроение смотреть 'My Little Pony'"
            7 -> return "Настроение ехидно смеяться"
            else -> return "Нет такого настроения"
        }
    }
    fun ColorCode(color: Color) {
        println("Код цвета: #${color.colorValue.toString(16)}")
    }
}
