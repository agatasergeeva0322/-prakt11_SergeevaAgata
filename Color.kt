enum class Color (val colorValue: Int) {
    SlateBlue(0x6A5ACD),
    PaleGreen(0x98FB98),
    CornflowerBlue(0x6495ED),
    PaleGoldenrod(0xEEE8AA),
    Lavander(0xE6E6FA),
    DeepPink(0xFF1493),
    Crimson(0xDC143C);

    fun getColor(): String {
        return when (this) {
            SlateBlue -> "Сланцевый"
            PaleGreen -> "Бледно-зелёный"
            CornflowerBlue -> "Васильковый"
            PaleGoldenrod -> "Бледно-золотистый"
            Lavander -> "Лавандовый"
            DeepPink -> "Дико-розовый"
            Crimson -> "Кровавый"
        }
    }
}