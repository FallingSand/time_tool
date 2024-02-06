package state

class State {
    data class TimeProportion (val year: Short)

    enum class DataType {
        Sec,
        Min,
        Hou,
        HouDay,
        DayWee,
        DayWeeMon,
        DayMon,
        DayYea,
        WeeMon,
        WeeYea,
        Mon,
        Yea
    }
}