class Public {
    companion object {
        var fileInited: Boolean = false
            set(value) {
                field = if (value) true else (if (fileInited) true else false)
            }
    }
}