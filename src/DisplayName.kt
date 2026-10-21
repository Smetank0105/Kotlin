class DisplayName{
    var name:String = "Unknown"
        set(value) {
            val trimmed = value.trim()
            field = if (trimmed.isEmpty()) "Unknown" else trimmed
        }
}